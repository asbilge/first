package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LocatarsPractice {

    public static void main(String[] args) throws Exception{
            //to setup chorome driver
            WebDriverManager.chromedriver().setup();
            //to create an object of Chrome Driver class
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
            driver.get("http://google.com");
            WebElement btnI =driver.findElement(By.id("gbqfbb"));
            String actualText= btnI.getAttribute("value") ;
            String expectedText= "I'm Feeling Lucky";
            if (actualText.equals(expectedText)) {
                System.out.println("passed");
            }else {
                System.out.println("failed");
                System.out.println("expected test " + expectedText);
                System.out.println("actual text " + actualText);
            }








    }


    }











