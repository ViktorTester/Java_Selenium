package day31_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get ("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


// Выбор конкретной опции дропдауна

        // Заносим локатор дропдауна в переменную
        WebElement drpCountFy = driver.findElement(By.xpath("//select [@id='country']")) ;

        // Класс Select необходим для работы с дропдаунами с тегом <select>
        // Передаем переменную в объект класса Select
        Select drpCountry = new Select(drpCountFy);

        // Используя встроенный метод класса Select, можно выбрать опцию дропдауна по:

    // Ее текстовому значению - selectByVisibleText();
        drpCountry.selectByVisibleText("France");
    // Ее атрибуту value - selectByValue();
        drpCountry.selectByValue("japan");
    // Ее индексу - selectByIndex();
        drpCountry.selectByIndex(4);


// Занесение всех опций дропдауна в массив

        // Перемещение всех опций дропдауна в массив
        List<WebElement> optionsCount = drpCountry.getOptions();

        // Вывод длины массива
        System.out.println("Number of options in dropdown" + optionsCount.size());


// Вывод каждой опции в консоль

        // for loop
        for(int i = 0; i < optionsCount.size(); i++) {
            System.out.println(optionsCount.get(i).getText());
        }

        // foreach loop
        for (WebElement webElement : optionsCount) {
            System.out.println(webElement.getText());
        }

    }
}
