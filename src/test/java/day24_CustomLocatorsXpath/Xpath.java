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

        // Использование нескольких атрибутов дает более стабильный путь,
        // однако и повышает риск ошибки, если один из атрибутов изменится
        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']"))
                .sendKeys("T-shirts");


// Частичный Xpath с операторами 'and' или 'or'

        // Xpath будет работать только если атрибуты по обе стороны
        // оператора 'and' верны. Похоже на простое использование Xpath
        // с несколькими атрибутами, только посредством оператора 'and'
        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']"))
                .sendKeys("T-shirts");


        // Xpath будет работать если хотя-бы один из атрибутов по обе
        // стороны оператора 'or' является корректным.
        driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']"))
                .sendKeys("T-shirts");


// Частичный Xpath с внутренним текстом

        // В данном случае не указывается ни один атрибут элемента, однако
        // используется метод text() с указанием тега и его внутреннего текста.
        // Можно использовать не только для элементов со ссылками
        driver.findElement(By.xpath("//a[text()='MacBook']")).click();


// Частичный Xpath с поиском по части значения атрибута

        // В данном случае используется метод contains, в который нужно
        // передать два параметра - атрибут и часть его значения.
        // По этим вводным будет найден подходящий элемент
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]"))
                .sendKeys("T-Shirt");


// Частичный Xpath с поиском по начальной части значения атрибута

        // В данном случае используется метод starts-with, в который нужно
        // передать два параметра - атрибут и начальную часть его значения.
        // По этим вводным будет найден подходящий элемент
        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]"))
                .sendKeys("T-Shirt");
    }
}
