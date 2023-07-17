package com.eurotech.tests.day3_webelement_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) throws InterruptedException {

        /*
        --open the chrome browser
        --navigate the "http://eurotech.study/login"
        --Click login button
        --verify that url did has changed
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");
        driver.findElement(By.id("rcc-confirm-button")).click();
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
        Thread.sleep(2000);

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="http://eurotech.study/login";

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
