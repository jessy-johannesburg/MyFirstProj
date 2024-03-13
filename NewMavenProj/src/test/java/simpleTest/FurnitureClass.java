package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FurnitureClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
//(//a[@href='ng-tns-c230-2'])[1]
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.fantasticfurniture.com.au/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='ng-tns-c230-2']")).click();
//        List<WebElement> lists = driver.findElements(By.xpath("//ul[@role ='listbox']/li"));
//        System.out.println(lists.size());
//        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[text()='Bedroom Packages']//ancestor::ul[@class='child-menu-mobile ng-tns-c230-2 ng-trigger ng-trigger-expandCollapseOrder ng-star-inserted'])[1]//a[text()='Wardrobes']")).click();
    }
}