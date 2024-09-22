package day25_XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;


public class XpathAxes {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        // self::a: Выбирает текущий узел (сам элемент).
        // Находит элемент <a>, содержащий текст "L&T", и выводит его текст.
        String text = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/self::a")).getText();
        System.out.println("Self : " + text); // L&T

        // parent::td: Выбирает родительский элемент текущего узла.
        // Получает текст родительского элемента <td> для выбранного элемента <a>.
        text = driver.findElement(By.xpath("//a[contains(text(), 'L&T' )]/parent::td")).getText();
        System.out.println("Parent : " + text); // L&T


        // child::td: Выбирает все дочерние элементы текущего узла.
        // Находит все дочерние элементы <td> для строки таблицы <tr>, являющейся предком элемента <a>, и выводит их количество.
        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(), 'L&T')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements: " + childs.size()); // 12


        // ancestor::tr: Выбирает всех предков (родители, бабушки/дедушки и т.д.) текущего узла.
        // Получает текст всего ряда таблицы <tr>, который является предком элемента <a>.
        text = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/ancestor::tr")).getText();
        System.out.println("Ancestor : " + text);
        // 					L&T
        //
        //
        //				A
        //				3,682.50
        //				3,795.55
        //				+   3.07
        //				Buy | Sell

        // descendant::*: Выбирает всех потомков текущего узла.
        // Находит всех потомков (элементы внутри предка <tr>) и выводит их количество.
        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/descendant::*"));
        System.out.println("Number of descendant nodes: " + descendants.size()); // 20


        // following::tr: Выбирает все элементы, которые идут в документе после закрывающего тега текущего узла.
        // Находит все ряды таблицы <tr>, которые следуют за предком элемента <a>.
        List<WebElement> followingnodes = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/following::tr"));
        System.out.println("Number of following nodes: " + followingnodes.size()); // 397


        // preceding::tr: Выбирает все элементы, которые идут перед текущим узлом в документе.
        // Находит все ряды таблицы <tr>, которые расположены до предка элемента <a>.
        List<WebElement> precedings = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of preceding nodes: " + precedings.size()); // 225


        // following-sibling::tr: Выбирает всех «братьев и сестер» (элементы на том же уровне), которые идут после текущего узла.
        // Находит всех «соседей» по строке таблицы, которые идут после предка элемента <a>.
        List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(), 'L&T')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of Following Siblings: " + followingsiblings.size()); // 395


        // preceding-sibling::tr: Выбирает всех «братьев и сестер», которые идут перед текущим узлом.
        // Находит всех «соседей» по строке таблицы, которые расположены до предка элемента <a>.
        List<WebElement> precedingsiblings = driver.findElements(By.xpath("//a[contains(text(), 'L&T')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of preceding sibling nodes: " + precedingsiblings.size()); // 224

        System.out.println(driver.getPageSource());


    }
}
