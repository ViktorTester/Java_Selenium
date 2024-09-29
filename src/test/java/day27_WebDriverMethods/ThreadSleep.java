package day27_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new SafariDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Остановка выполнения кода на 5 секунд
        // Без остановки данный код не найдет элемент
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

    }
}
