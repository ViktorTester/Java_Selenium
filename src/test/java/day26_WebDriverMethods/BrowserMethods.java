package day26_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();

        // Открытие первой вкладки
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        // Открытие второй вкладки
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        // Закрывает только текущую вкладку
        driver.close();

        Thread.sleep(5000);
        // Закрывает все вкладки
        driver.quit();


    }
}
