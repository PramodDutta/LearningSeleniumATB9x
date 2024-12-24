package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {

        // Webdriver hierarchy

        // SearchContext(I) -> (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)


        // SearchContext(I)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C)
        // -> ChromiumDriver(C)
        // -> ChromeDriver(C)


        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

        // SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
        // ChromeDriver  driver = new ChromeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
        // ChromeDriver driver = new ChromeDriver(); ~1%


        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver(); // 97% -
        driver = new FirefoxDriver(); // 97% -

        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)









    }

}
