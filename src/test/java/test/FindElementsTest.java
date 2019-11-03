package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle = driver.getTitle();
        //Step1. open inspector in chrome and find locator for the element
        //Step2. create object of WebElement
        //Step3. Use webelement
        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on the element
        button.click();
        //read title again , after clicking
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected Title :"+actualTitle);
            System.out.println("Actual Title:"+ actualTitle);
        }
        //wait for 2 seconds
        BrowserUtils.wait(2);
        driver.close();









    }



}
