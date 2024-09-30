package day28_WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationCommands {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver driver = new SafariDriver();

// .navigate().to()

        // Два метода, перечисленных ниже, одинаковы по
        // действию, но разные по реализации:

        // В .get() метод можно передать только строку - URL
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // В метод .navigate().to() можно передать как строку, так и URL-объект
        driver.navigate().to(myurl);


    // Окно открыто по ссылке "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        // На данном этапе открыто две ссылки одна поверх другой в одном окне.
        // Это значит, что можно воспользоваться функцией 'back' и вернуться к
        // первой вызванной ссылке

        // Возвращение на страницу "https://demo.nopcommerce.com/"
        driver.navigate().back();

        // Задержка для лицезрения результата
        Thread.sleep(3000);

    // Открыта страница "https://demo.nopcommerce.com/"

        // Переход вперед на страницу "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        driver.navigate().forward();

        // Задержка для лицезрения результата
        Thread.sleep(3000);

    // Открыта страница "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

        // Обновление страницы
        driver.navigate().refresh();

        // Задержка для лицезрения результата
        Thread.sleep(3000);

        driver.quit();

    }
}
