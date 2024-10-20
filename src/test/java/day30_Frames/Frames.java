package day30_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

// Frame 1
    // driver.switchTo().frame(WebElement)

        // Нахождение локатора фрейма и помещение его в переменную типа WebElement
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        // Переключение на фрейм
        driver.switchTo().frame(frame1);

        // Нахождение локатора инпут-поля внутри фрейма и передача в него текста
        driver.findElement(By.xpath("//input [@name='mytext1']")).sendKeys ("welcome");


      // Возврат на основную страницу
        driver.switchTo().defaultContent();

// Frame 2
    // driver.switchTo().frame(WebElement)

        //Frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);

        // Если известен атрибут 'name' или 'id', то его можно передавать напрямую в метод .frame()
        //driver.switchTo().frame("frame1");

        // Если же используется обращение через WebElement, то его сперва нужно поместить в переменную

        // Нахождение локатора инпут-поля внутри фрейма и передача в него текста
        driver.findElement(By.xpath("//input [@name='mytext2']")).sendKeys("selenium");


// Frame 3
        // Во фрейме 3 находится еще один фрейм с формой для заполнения,
        // и для взаимодействия с ним сперва нужно перейти во фрейм 3, а
        // потом уже в сам фрейм с формой

        // Нахождение локатора фрейма и переключение драйвера на него
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        // Находясь во фрейме 3, передаем в инпут-поле значение
        driver.findElement(By.xpath("//input [@name='mytext3']")).sendKeys("Java");


    // Вложенный фрейм

        // Так как нужно переместиться во фрейм, который вложен во фрейм 3, то это
        // можно сделать напрямую, без возвращения на основную страницу
        // Переключение с помощью индекса фрейма
        driver.switchTo().frame(0);

        // Клик по одному из чекбоксов вложенного фрейма
        driver.findElement(By.xpath("//div[@id='18']//div[@class='AB7Lab Id5V1']")).click();

        // Возврат на основную страницу
        driver.switchTo().defaultContent();

    }
}
