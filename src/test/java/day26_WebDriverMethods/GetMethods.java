package day26_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();

// get()
        // Открытие страницы в браузере
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

// getTitle()
        // Возвращает тайтл страницы (по тегу <title>)
        System.out.println("Current title is " + driver.getTitle());
        // Current title is OrangeHRM


// getCurrentUrl()
        // Возвращает текущий URL
        System.out.println("Current URL is " + driver.getCurrentUrl());
        // Current URL is https://opensource-demo.orangehrmlive.com/web/index.php/auth/login


// getPageSource()
        // Выводит весь исходный код страницы, очень много строк
        System.out.println(driver.getPageSource());



// getWindowHandle()
        // Возвращает идентификатор вкладки, уникальный для каждой сессии
        System.out.println("Current window ID is " + driver.getWindowHandle());
        // Current window ID is page-26D1B89E-F31F-46B8-B072-F74D0E7BA62E


// getWindowHandles()
        // Возвращает идентификаторы всех вкладок, уникальные для каждой сессии

        // Нажатие на линк на странице для открытия еще одного окна
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        // Создание множества (set) для хранения полученных id
        Set<String> windowHandles = driver.getWindowHandles();

        // Вывод полученных id через цикл
        for (String handle : windowHandles) {
            System.out.println(handle);
        }

        // page-E933C46D-30F2-456A-B38B-B8770BC1B191
        // page-832B2936-23EA-4E7F-A8C7-994E488BFB9A

        driver.close();
    }
}
