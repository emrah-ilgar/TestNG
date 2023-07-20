package com.eurotech.tests.day4_basicLocators;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
         /*
        --open chrome browser
        --navigate ebay.com
        --search selenium
        --verify that result area has selenium text
         */


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //WebElement searchInput = driver.findElement(By.name("_nkw"));
        WebElement searchInput = driver.findElement(By.id("gh-ac"));
        searchInput.sendKeys("selenium");
        Thread.sleep(1000);

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        WebElement resultText = driver.findElement(By.className("srp-controls__count-heading"));
        String actualText = resultText.getText();
        System.out.println("actualText = " + actualText);

        boolean result = actualText.contains("selenium");
        if (result==true){
            System.out.println("Result text contains selenium keyword");
        }else{
            System.out.println("Result text is not contains selenium keyword");
        }

        Thread.sleep(2000);
        driver.close();

    }
}
