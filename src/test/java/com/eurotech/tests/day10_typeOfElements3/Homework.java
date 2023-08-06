package com.eurotech.tests.day10_typeOfElements3;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }


    @Test
    public void iframe() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(2000);
        driver.switchTo().frame("frame-bottom");
        WebElement bottomText = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
        System.out.println("bottomText.getText() = " + bottomText.getText());


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
