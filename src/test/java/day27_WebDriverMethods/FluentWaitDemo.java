package day27_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();

// Гибкое ожидание

    // Объявление
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Общее время ожидания
                .pollingEvery(Duration.ofSeconds(5))  // Интервал проверки
                .ignoring(NoSuchElementException.class);  // Игнорируемые исключения


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


    // Использование
        // Тут указывается локатор искомого элемента
        WebElement txtusername = wait.until(new Function<>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//input[@placeholder='Username']"));
            }
        });


        // Действие с найденным элементом
        txtusername.sendKeys("Admin");

        driver.close();
    }
}
