package com.eurotech.tests.day8_typeOfElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {
    /*okkkkkk
        --Navigate https://rahulshettyacademy.com/AutomationPractice/
        --verify that option1 is unselected
        --Click option1
        ==verify that option1 is selected
        --Click option2
        --verify that option2 is selected
        --verify that option3 is unselected
         */

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement option1Btn = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        Assert.assertFalse(option1Btn.isSelected(),"option1 is selected");
        option1Btn.click();
        Assert.assertTrue(option1Btn.isSelected(), "Option 1 is not selected");
        Thread.sleep(2000);

        WebElement option2Btn = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
        option2Btn.click();
        Assert.assertTrue(option2Btn.isSelected(), "Option 2 is not selected");
        Thread.sleep(2000);

        WebElement option3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
        Assert.assertFalse(option3.isSelected(), "Option 3 is selected");

        Thread.sleep(2000);
        driver.close();



    }

}
