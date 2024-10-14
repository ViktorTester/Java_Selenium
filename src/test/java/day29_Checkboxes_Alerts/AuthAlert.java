package day29_Checkboxes_Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AuthAlert {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        // Логин и пароль передаются напрямую в URL
        // "http://{login:pass}@{URL}"
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
