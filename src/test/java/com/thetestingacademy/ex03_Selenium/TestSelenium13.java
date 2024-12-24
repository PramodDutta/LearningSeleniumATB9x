package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        WebDriver driver = new ChromeDriver();
       // driver.get("google.com");
        driver.get("https://google.com");









    }

}
