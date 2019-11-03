package test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome .ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class fdgdfgs {
       public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
           ChromeDriver driver= new ChromeDriver();
        driver.get("http://google.com");
           //Test 1. Verify that title of the page is a "Google"
           String actualResult = driver.getTitle();
           String expectedResult = "Google";
           if(actualResult.equals(expectedResult)){
               System.out.println("Test passed");
           }else {
               System.out.println("Test failed");
           }
           //to close browser
           driver.close();
       }
}


