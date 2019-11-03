package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasiNavigation {

    public static void main(String[] args)throws Throwable {
        //to setup chorome driver
        WebDriverManager.chromedriver().setup();
        //to create an object of Chrome Driver class
        ChromeDriver driver= new ChromeDriver();
        String url ="https://google.com";
        String url2 ="https://amazon.com";
        //driver close with url
        driver.get(url );
        //put on hold current run for 3 seconds
        Thread.sleep(3000);
        //navigate to amazon.com
        driver.navigate().to(url2);
        Thread.sleep(3000);
        //will navigate back to the previous URL
        //in our cases it will go back google
        driver.navigate().back();
        //wait for 3 seconds
        Thread.sleep(3000);
        //navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);
        //will refresh the page
        driver.navigate().refresh();
        //driver will close
        driver.close();



    }


}
