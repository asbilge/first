package test.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com" );
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();






    }

}
