package day29_Checkboxes_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Работа с алертами через явное ожидание
// Работает со всеми типами алертов
public class HandlingAlertWithExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();

        // Объявление объекта класса явного ожидания
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Переход на страницу
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // Клик по элементу, который триггерит алерт
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        // Занесение алерта в переменную myalert типа Alert
        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());

        myalert.accept();

    }
}
