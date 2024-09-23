package day26_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class ConditionalMethods {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        
// isDisplayed()
        // Возвращает true если элемент отображается на странице
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.isDisplayed()); // true

        // Аналогично коду выше
        boolean status1 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("isDisplayed() = " + status1); // isDisplayed() = true


// isEnabled()
        // Возвращает true если элемент включен (enabled)
        boolean status2 = driver.findElement(By.xpath("*//input[@id='FirstName']")).isEnabled();
        System.out.println("isEnabled() = " + status2); // isEnabled() = true


// isSelected()
        // Возвращает true если radiobutton или checkbox отмечен
        // (Также относится к дропдаунам, но редко)

        // Нахождение элементов двух radiobutton и помещение их в переменные
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']")) ;
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

        // Ни одна radiobutton не выбрана, поэтому значение переменных равно false
        System.out.println(male_rd.isSelected());  // false
        System.out.println(female_rd.isSelected());  // false

        // Отмечаем одну из radiobutton
        female_rd.click();

        // Теперь одна из radiobutton выбрана, поэтому значение одно из
        // переменных равно false, а второй - true
        System.out.println(male_rd.isSelected());  // false
        System.out.println(female_rd.isSelected());  // true


        driver.close();

    }
}
