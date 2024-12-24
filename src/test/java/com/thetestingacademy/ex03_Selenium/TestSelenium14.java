package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium14 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        // Close - will close the current tab, not the session
        // session id != null

//        Thread.sleep(3000);
//        driver.close();





        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null










    }

}
