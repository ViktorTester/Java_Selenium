package day27_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new SafariDriver();

// Неявное ожидание
        // Указывается один раз после объявления объекта класса драйвера
        // Действует на весь код в данном классе
        // Если элемент найден быстрее, то код продолжит выполнение сразу же, после его нахождения
        // Если элемент не найден за отведенное время, то код упадет в ошибку
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        driver.close();

    }
}
