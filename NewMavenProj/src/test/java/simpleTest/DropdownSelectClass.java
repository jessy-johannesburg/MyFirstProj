package simpleTest;

import org.openqa.selenium.WebDriver;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownSelectClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("QA jobs in johannesburg");
        Thread.sleep(1000);

//         Identify all webelents from dropdown
        List<WebElement> lists = driver.findElements(By.xpath("//ul[@role ='listbox']/li"));
//        To print all the values under dropdown
//         for(WebElement ele : lists){
//              System.out.println(ele.getText());

        //          To print the size of list
        System.out.println(lists.size());

        for(int i=0;i<lists.size();i++){
            String listitem = lists.get(i).getText();
            System.out.println(listitem);
            if(listitem.contains("qa jobs in johannesburg")){
                lists.get(i).click();
                break;
            }

        }
          }


    }
