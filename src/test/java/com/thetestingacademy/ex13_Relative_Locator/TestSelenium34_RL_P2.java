package com.thetestingacademy.ex13_Relative_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class TestSelenium34_RL_P2 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description("Verify JS")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        // iframe
        driver.switchTo().frame("result");


        WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));
        submit.click();


        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));

        String errorText = error_element.getText();
        Assert.assertTrue(error_element.isDisplayed());
        Assert.assertEquals(errorText,"Username must be at least 3 characters");









































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
