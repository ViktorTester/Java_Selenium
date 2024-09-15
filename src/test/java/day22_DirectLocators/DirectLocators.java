package day22_DirectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DirectLocators {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.opencart.com/");
        // окно открывается в развернутом виде
        driver.manage().window().maximize();

// name
        // нахождение строки поиска по атрибуту "name" и
        // передача в эту строку теста - "Mac"
        driver.findElement(By.name("search")).sendKeys("Mac");


// className

        // Найденная группа элементов сохраняется в массив
        // Обязательно нужно указать тип элементов в массиве - <WebElement>
        List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        // вывод длины массив (равное количеству искомых элементов) для проверки
        System.out.println(headerLinks.size());


// tagName
        // Найденная группа элементов сохраняется в массив
        // Обязательно нужно указать тип элементов в массиве - <WebElement>
        // Поиск количества ссылок на странице
        List<WebElement> allPageLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total number of page links = " + allPageLinks.size());

        // Поиск количества картинок на странице
        List<WebElement> allPageImages = driver.findElements(By.tagName("img"));
        System.out.println("Total number of page images = " + allPageImages.size());


// id
        // нахождение элемента по его id
        boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
        // вывод значения true/false в консоль для проверки
        System.out.println(logoDisplayStatus);


// linkText
        // нахождение кнопки (со ссылкой внутри) по тексту и клик по ней
        driver.findElement(By.linkText("Tablets")).click();

        // Из-за срабатывания CloudFlare пришлось указать ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


// partialLinktext
        // аналогично предыдущему методу тут осуществляется поиск
        // кнопки по тексту (Software) внутри нее, но не полному, а лишь его части.
        // Это рискованный способ, так как элементов содержащих полный текст,
        // очевидно гораздо меньше (в идеале 1), чем элементов,
        // содержащих кусок текста. Это надо учитывать
        driver.findElement(By.partialLinkText("Soft")).click();

        driver.close();

    }
}
