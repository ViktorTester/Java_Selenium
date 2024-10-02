package day28_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserTabs {
    public static void main(String[] args) throws java.lang.InterruptedException{

        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Открытие страницы (первая вкладка)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Открытие страницы (Вторая вкладка)
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();

        // Из множества нужно сделать массив и занести его элементы в переменную
        List<String> windowList = new ArrayList(windowIDs);

        // Занесение каждой вкладки в переменную
        String parentID = windowList.get(0);
        String childID = windowList.get(1);

        // переход по вкладкам
        driver.switchTo().window(childID);
        // переход по вкладкам
        driver.switchTo().window(parentID);

    }
}
