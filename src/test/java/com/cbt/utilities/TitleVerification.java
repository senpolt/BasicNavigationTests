package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        boolean url1 =driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");

        DriverUtils.wait(3);
        driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        boolean url2 =driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");

        DriverUtils.wait(3);

        driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        DriverUtils.wait(3);
       boolean url3 =driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");

        if(title1.equals(title2)&&title2.equals(title3)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }

        System.out.println("Title1 is..."+title1);
        System.out.println("Title2 is..."+title2);
        System.out.println("Title3 is..."+title3);
        System.out.println("###########################################################");

        if(url1&& url2&& url3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        driver.quit();
    }
}
