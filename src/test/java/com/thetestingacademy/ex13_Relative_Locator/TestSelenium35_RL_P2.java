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

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class TestSelenium35_RL_P2 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description("Verify RL")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();


        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement e  : locations){
            System.out.println(e.getText());
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(e)).getText();


            System.out.println("| +" + rank +" | " + e.getText() + " | " + aqi + " | ");


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
