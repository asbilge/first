package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

    public static void main(String[] args) {
     //to set up chrome driver
    WebDriverManager.chromedriver().setup();
        //to create an object of Chrome Driver class
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        String title =driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.close();








}}
