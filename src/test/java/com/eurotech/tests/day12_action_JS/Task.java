/*
package com.eurotech.tests.day12_action_JS;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void hoverOver(){
        driver.get("https://the-internet.herokuapp.com/hovers");


        WebElement img1Text = driver.findElement(By.xpath("//h5[text()='name: user1']"));
        Actions actions = new Actions(driver);

        actions.moveToElement(img1Text).perform();
        Assert.assertTrue(img1Text.isDisplayed());

        WebElement img2Text = driver.findElement(By.xpath("//h5[text()='name: user2']"));
        actions.moveToElement(img2Text).perform();
        Assert.assertTrue(img2Text.isDisplayed());

        WebElement img3Text = driver.findElement(By.xpath("//h5[text()='name: user3']"));
        actions.moveToElement(img3Text).perform();
        Assert.assertTrue(img3Text.isDisplayed());






    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
*/
