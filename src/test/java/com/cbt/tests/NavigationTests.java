package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.DriverUtils;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        DriverUtils.wait(3);
        String title = driver.getTitle();

        driver.get("https://etsy.com");

        String title2 = driver.getTitle();//returns <title>Some title</title> text

        driver.navigate().back();
        if(title2.equals(title)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
        System.out.println("Title is..."+title);
        System.out.println("Title2 is..."+title2);


        driver.navigate().forward();

       String title3 =driver.getTitle();
        if(title3.equals(title2)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }

        System.out.println("Title2 is..."+title2);
        System.out.println("Title3 is..."+title3);


        DriverUtils.wait(3);
        driver.quit();
    }
}