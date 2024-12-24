package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");






    }

}
