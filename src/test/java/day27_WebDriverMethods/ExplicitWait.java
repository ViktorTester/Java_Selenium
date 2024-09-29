package day27_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();

// Явное ожидание
    // Объявление
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    // Использование
        // Ожидание пока инпут-поле логина будет видно
        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        txtusername.sendKeys("Admin");

        // Ожидание пока инпут-поле пароля будет видно
        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        txtpassword.sendKeys("Admin");

        // Ожидание пока кнопка будет кликабельна
        WebElement loginbutton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='login']")));
        loginbutton.click();

        driver.close();


    }
}