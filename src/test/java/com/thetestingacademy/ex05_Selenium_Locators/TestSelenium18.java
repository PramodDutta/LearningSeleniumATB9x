package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18 {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>

        //         // Link Text - Full Text Match
//        WebElement a_tag_free_trail =  driver.findElement(By.linkText("Start a free trial"));
//        a_tag_free_trail.click();



        // Partial Only work -  Contains - Partial Match
        WebElement a_tag_free_trail_partial =  driver.findElement(By.partialLinkText("Start"));
        a_tag_free_trail_partial.click();

        //Start a free trial
        //a free trial
        //free trial
        //trial
        // Start







        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null










    }

}
