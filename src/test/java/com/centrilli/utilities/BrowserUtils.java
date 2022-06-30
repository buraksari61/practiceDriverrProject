package com.centrilli.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {

    public static void titleVerification(WebDriver driver,String expectedTitle){

        Assert.assertEquals(expectedTitle,driver.getTitle());
    }
}
