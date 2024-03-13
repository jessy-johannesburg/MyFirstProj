package simpleTest;

import com.sun.tools.javac.comp.Enter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {


    public static void main(String[] args){
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String ActualTitle = driver.getTitle();
        System.out.println("Title is "+ActualTitle );
        String ExpectedTitle = "Google";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
       driver.findElement(By.id("APjFqb")).sendKeys("QA jobs in johannesburg");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);



    }
}
