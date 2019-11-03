package test.day3;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferenceBetweenQuitaAndClose {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);//will pause program execution for 4 seconds
        //let's try to close browser.
//        driver.close();//will close only one tab
        driver.quit();//to shutdown entire browser
    }
}
