package day29_Checkboxes_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {

        WebDriver driver=new SafariDriver();

        driver.get ("https://testautomationpractice.blogspot.com/");
        driver.manage ().window().maximize();

// 1) Выбор и нажатие на один чекбокс
        driver.findElement(By.xpath("//input[@id='sunday']")).click();


// 2) Выбор и нажатие на все чекбоксы в конкретном блоке
        // В список заносятся все чекбоксы, имеющие общий локатор
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input [@class='form-check-input' and @type='checkbox']"));

        // Цикл перебирает каждый чекбокс в списке и осуществляет нажатие
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }

        // Допустим нужно выбрать последние несколько чекбоксов,
        // для этого можно использовать удобную формулу:
        // (Общее кол-во чекбоксов) - (кол-во чекбоксов, которое нужно отметить) = индекс


// 3) Отметить последние чекбоксы
        // Допустим надо отметить последние 3 чекбокса с конца. Всего 7 чекбоксов
        // Формула: 7 - 3 = 4

        // Тут уже придется использовать стандартный цикл for,
        // так как необходимо указывать индекс элемента.
        // Таким образом последние 3 чекбокса будут нажаты
        for (int i = 4; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }


// 4) Отметить первые чекбоксы
        // Допустим надо отметить первые 3 чекбокса
        for (int i = 0; i < 3; i++) {
            checkboxes.get(i).click();
        }


// 5) Отжать уже нажатые чекбоксы
        // Цикл перебирает все чекбоксы и проверяет есть ли среди них
        // уже нажатые. Если такой чекбокс присутствует, то он
        // будет нажат снова, что означает его отжатие
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }

    }
}
