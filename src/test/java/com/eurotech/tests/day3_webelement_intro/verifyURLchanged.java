package com.eurotech.tests.day3_webelement_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.security.auth.login.FailedLoginException;

public class verifyURLchanged {
    public static void main(String[] args) throws InterruptedException {
          /*
        --open the chrome browser
        --navigate the "http://eurotech.study/login"
        --enter email address "eurotech@gmail.com"
        --enter password "Test12345!"
        --Click login button
        --verify that url has changed
         */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");
        WebElement understandBtn = driver.findElement(By.id("rcc-confirm-button"));
        understandBtn.click();

        String email="eurotech@gmail.com";
        String password="Test12345!";

        WebElement emailInput = driver.findElement(By.id("loginpage-input-email"));
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.id("loginpage-form-pw-input"));
        passwordInput.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
        Thread.sleep(2000);

        String actualURL=driver.getCurrentUrl();
        String expectedURL="http://eurotech.study/dashboard";
        Thread.sleep(2000);

        if (expectedURL.equals(actualURL)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();
    }
}
