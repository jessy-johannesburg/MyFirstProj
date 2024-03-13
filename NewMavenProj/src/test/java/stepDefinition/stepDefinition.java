package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinition {
    WebDriver driver;


    @Given("^user launch browser$")
    public void user_launch_browser(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }

    @When("^user is on google page and verify the title$")
    public void user_is_on_google_page(){
        String ActualTitle = driver.getTitle();
        System.out.println("Title is "+ActualTitle );
        String ExpectedTitle = "Google";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @When("user captures QA jobs in johannesburg")
    public void user_captures_QA_jobs_in_johannesburg(){
        driver.findElement(By.id("APjFqb")).sendKeys("QA jobs in johannesburg");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    }

    @When("user should see the results")
    public void user_should_see_the_results(){
        String ActualTitle = driver.getTitle();
        System.out.println("Title is "+ActualTitle );
        String ExpectedTitle = "Jobs";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
}
