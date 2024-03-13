package SauceDemoTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoNegScenario {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Maximize the browser
        driver.manage().window().maximize();
        // Launch Website
        driver.get(" https://www.saucedemo.com/");
        // Maximize window size of browser
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter your login password
        driver.findElement(By.id("password")).sendKeys("secret_sauc");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        String ActualTitle = "Epic sadface: Username and password do not match any user in this service";
        WebElement ExpectedTitle = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(ExpectedTitle.getText(), ActualTitle);
        System.out.println("neg scenaro successful");
        driver.close();

    }
}