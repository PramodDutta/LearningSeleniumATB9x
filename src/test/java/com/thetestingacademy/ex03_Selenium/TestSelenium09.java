package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        Assert.assertEquals(driver.getTitle(),"dadadaGoogle");






    }

}
