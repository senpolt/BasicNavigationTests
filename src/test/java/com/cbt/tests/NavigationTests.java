package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.DriverUtils;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {
        //#######  CALL THE METHOD
        getbrowser("chrome","https://google.com");
       // getbrowser("firefox","https://google.com");
           //getbrowser("edge","https://etsy.com");

        //###########TEST CASE
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        DriverUtils.wait(3);
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();//returns <title>Some title</title> text
        DriverUtils.wait(3);
        driver.navigate().back();
        StringUtility.verifyEquals(title2,title);
        DriverUtils.wait(3);
        driver.navigate().forward();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title3,title2);

        DriverUtils.wait(3);
        driver.quit();
    }



    public static void getbrowser(String browserName, String website) {
        WebDriver driver = BrowserFactory.getDriver(browserName);
        driver.get(website);
        String title = driver.getTitle();
        StringUtility.verifyEquals(driver.getCurrentUrl(), title);
        DriverUtils.wait(2);
        driver.close();
    }
}