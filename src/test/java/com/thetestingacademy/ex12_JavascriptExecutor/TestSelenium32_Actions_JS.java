package com.thetestingacademy.ex12_JavascriptExecutor;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium32_Actions_JS {

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
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        //js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);

        js.executeScript("window.scrollTo(0,1000)");





































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
