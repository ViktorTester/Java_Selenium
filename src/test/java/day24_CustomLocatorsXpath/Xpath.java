package day24_CustomLocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();


// Частичный Xpath с одним атрибутом

        driver.findElement(By.xpath("//input[@placeholder='Search']"))
                .sendKeys("T-shirts");


// Частичный Xpath с несколькими атрибутами
        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']"))
                .sendKeys("T-shirts");

    }
}
