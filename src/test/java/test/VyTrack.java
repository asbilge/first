package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class VyTrack {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user2");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        BrowserUtils.wait(3);
        driver.findElement(By.id("_submit")).click();

        String expectedURL = "https://qa2.vytrack.com/";
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        System.out.println(expectedURL);

        if(expectedURL.equals(actualURL)){
            System.out.println("Test PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.out.println(actualURL);
            System.out.println(expectedURL);
        }

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }


    }


}




