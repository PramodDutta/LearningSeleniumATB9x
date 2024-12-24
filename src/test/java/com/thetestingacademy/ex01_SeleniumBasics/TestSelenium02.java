package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01(){

        // Open a URL
        // Print the title
        EdgeDriver driver = new EdgeDriver();

        // new EdgeDriver(); -> POST Request (localhost:56055), Create Session Endpoint
        // Edge Real Browser

        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());




    }

}
