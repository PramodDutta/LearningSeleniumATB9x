package com.thetestingacademy.ex14_Selenium_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class TestSelenium36_Selenium_NoSuchElement {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description("Verify RL")
    @Test
    public void test_actions(){
        driver.get("https://app.vwo.com/");
        try {
            driver.findElement(By.id("pramod"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }













































    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }





}
