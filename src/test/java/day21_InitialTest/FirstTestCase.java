package day21_InitialTest;

/*
1 - Open browser
2 - Open URL https://demo.opencart.com/
3 - Validate title - should be 'Your Store'
4 - Close browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {
    public static void main(String[] args) {

//  1 - Open browser

        // Для запуска хрома нужно создать объект класса ChromeDriver
        // Сама по себе эта строка уже открывает браузер
        WebDriver driver = new EdgeDriver();


//  2 - Open URL https://demo.opencart.com/
        driver.get("https://demo.opencart.com/");


//  3 - Validate title - should be 'Your Store'

        // Получение фактического тайтла страницы с помощью метода
        String actual_title = driver.getTitle();

        // Сравнение фактического и ожидаемого результата
        if (actual_title.equals("Your Store")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }


//  4 - Close browser

        // driver.quit();
        // либо
        driver.close();


    }
}
