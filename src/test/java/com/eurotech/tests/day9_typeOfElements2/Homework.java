package com.eurotech.tests.day9_typeOfElements2;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Homework {
    // homework
    // navigate to "https://demoqa.com/elements"
    // Elements list - verify the size =9
    // assert every option is displayed on the page
    // print out all the options
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        // navigate to "https://demoqa.com/elements"
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
        // Elements list - verify the size =9
        List<WebElement> listItems2 = driver.findElements(By.cssSelector("div.element-list.collapse.show>ul>li"));
        int expectedSize=9;
        int actualSize= listItems2.size();
        Assert.assertEquals(expectedSize,actualSize,"There are "+expectedSize+ " options under Element button");

        // assert every option is displayed on the page
        for (WebElement item:listItems2){
            Assert.assertTrue(item.isDisplayed(),"not displayed");
        }

        // print out all the options
        for (WebElement item:listItems2){
            System.out.println(item.getText());
        }
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }
}
