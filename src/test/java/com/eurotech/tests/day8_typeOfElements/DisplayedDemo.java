package com.eurotech.tests.day8_typeOfElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1() throws InterruptedException {
//okkkkk
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //verify that Hello World! is not visible
        WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        Assert.assertFalse(helloWorld.isDisplayed(),"Hello world is displayed");

        //click start button
        WebElement startBtn = driver.findElement(By.xpath("//div[@id='start']/button"));
        startBtn.click();
        Thread.sleep(6000);

        //verify that Hello World! is visible (displayed)
        Assert.assertTrue(helloWorld.isDisplayed(),"Hello World is NOT DISPLAYED");



        Thread.sleep(2000);
        driver.close();
    }
}