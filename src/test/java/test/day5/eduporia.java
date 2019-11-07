package test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

import javax.swing.*;

class eduphoria {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://www.schoolobjects.com/eduphoria_webcontrols/Login.aspx?ReturnUrl=%2feduphoria_webcontrols%2fApplications.aspx");
//      <a href="/autocomplete">Autocomplete</a>
//        Autocomplete - it's the text that you see in the link
//        place where it will navigate you specified in href
//        it works only if tag name is <a>
//        if you want to use linkText or partialLinkText locator strategy
//        element must start with <a>
//        this is how we specify linkd in HTMLdriver.findElement(By.name("email")).sendKeys("asagbilge@harmonytx.org");

        driver.findElement(By.id("login-email")).sendKeys("asagbilge@harmonytx.org");
        driver.findElement(By.id("login-password")).sendKeys("Istanbul82$");
        driver.findElement(By.id("sign-in")).click();



        Thread.sleep(3000);

        // driver.quit();
    }
}
