package day29_Checkboxes_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Alerts {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

// Alert ('ok' or 'close' button)

    // Первый вариант:
        // Клик по элементу, который триггерит алерт
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        // Переключение с веб-сайта на алерт и нажатие на
        // единственную доступную опцию в этом алерте - ok/close
        driver.switchTo().alert().accept();

    // Другой вариант:
        // Занесение алерта в переменную для удобной работы с ним

        // Клик по элементу, который триггерит алерт
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        // Занесение алерта в переменную myalert типа Alert
        Alert myalert = driver.switchTo().alert();
        // Вывод текста алерта (если он есть) в консоль
        System.out.println(myalert.getText());
        // Нажатие на единственную доступную опцию в этом алерте - ok/close
        myalert.accept();


// Confirm alert ('ok' and 'cancel' buttons)

    // Кнопка ОК
        // Клик по элементу, который триггерит алерт
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

        // Переключение с веб-сайта на алерт и нажатие на
        // кнопку OK в алерте
        driver.switchTo().alert().accept();

    // Кнопка CANCEL
        // Клик по элементу, который триггерит алерт
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

        // Переключение с веб-сайта на алерт и нажатие на
        // кнопку CANCEl в алерте
        driver.switchTo().alert().dismiss();


// Prompt alert ('ok' and 'cancel' buttons and input field)

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        Alert myalert2 = driver.switchTo().alert();

        myalert2.sendKeys("Hello");
        myalert2.accept();







    }
}
