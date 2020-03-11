package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com", "https://www.westelm.com/");

        for (String eachurl : urls) {

            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(eachurl);
            driver.get(eachurl);
            String title=  driver.getTitle().replace(" ","").toLowerCase();

            System.out.println(title);
            DriverUtils.wait(2);
            if(driver.getCurrentUrl().contains(title)){
                System.out.println("TEST PASS!");
            }else {
                System.out.println("TEST FAIL!");
            }
            System.out.println(driver.getCurrentUrl());
            DriverUtils.wait(2);
            driver.close();

        }

    }

}

