package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class StringUtility {
    public static void verifyEquals(String expected  ,String actual){
        if(expected.equals(actual)){
            System.out.println("PASS!");
            System.out.println("Expected: "+expected);
            System.out.println("actual: "+actual);
        }else{
            System.out.println("FAIL!");
            System.out.println("Expected: "+expected);
            System.out.println("actual: "+actual);
        }

    }
}
