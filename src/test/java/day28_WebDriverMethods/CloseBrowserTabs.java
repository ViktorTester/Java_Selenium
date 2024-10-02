package day28_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Set;

public class CloseBrowserTabs {

    public static void main(String[] args) throws java.lang.InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Открытие страницы (первая вкладка)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Открытие страницы (Вторая вкладка)
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();

        // Цикл перебирает все id во множестве (в данном случае всего дважды),
        // и извлекает тайтл страницы. Если тайтл совпадает с искомым, то такая
        // вкладка закрывается
        for (String winid : windowIDs) {

            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if (title.equals("Human Resources Management Software | OrangeHRM")) {
                driver.close();
            }

        }
    }
}
