package day23_CustomLocators_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class CssLocators {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // поиск инпут-бокса и передача в него некого текста

//  tag + id

        // input = tag
        // small-searchterms = id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");


//  tag + class

        // input = tag
        // search-box-text = class name
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");


//  tag + attribute

        // input = tag
        // placeholder = attribute
        // Search store = value
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");


//  tag + class attribute

        // input = tag
        // search-box-text = class
        // name = attribute
        // q = value
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");

    }
}
