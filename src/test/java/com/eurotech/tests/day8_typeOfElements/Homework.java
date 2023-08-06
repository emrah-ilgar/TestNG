package com.eurotech.tests.day8_typeOfElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework {
    @Test
    public void test1() throws InterruptedException {
        /*

        --navigate https://demo.aspnetawesome.com/
        --verify that vegetable is selected
        --verify that legume is NOT SELECTED
        --click legume
        --Verify that vegetable is NOT SELECTED
         --verify that legume is selected
     */
        //navigate https://demo.aspnetawesome.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demo.aspnetawesome.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='btnCookie']")).click();

        WebElement vegetablesBtn = driver.findElement(By.xpath("//div[text()='Vegetables']/..//input"));
        //WebElement vegetablesBtn = driver.findElement(By.xpath("(//div[text()='Vegetables']/..//div)[1]"));
        Assert.assertTrue(vegetablesBtn.isSelected(),"Vegetables is not selected");

        //WebElement legumesBtn = driver.findElement(By.xpath("(//div[@class='o-chk '])[2]"));
        WebElement legumesBtn = driver.findElement(By.xpath("(//div[text()='Legumes']/..//div)[1]"));
        //WebElement legumesBtn = driver.findElement(By.xpath("//div[text()='Legumes']/..//input"));
        Assert.assertFalse(legumesBtn.isSelected(),"Legumes is selected");
        legumesBtn.click();
        Thread.sleep(2000);

        Assert.assertFalse(vegetablesBtn.isSelected(),"Vegetables is selected");
        Thread.sleep(4000);
        //Assert.assertTrue(legumesBtn.isSelected(),"Legumes is not selected");

        Thread.sleep(2000);
        driver.close();

    }
}
