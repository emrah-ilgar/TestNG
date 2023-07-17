package com.eurotech.tests.day3_webelement_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task {
    /*
          HomeWork
        --open the chrome browser
        --navigate the "http://eurotech.study/login"
        --enter email address "eurotech@gmail.com"
        --enter password "Test12345!"
        --Click login button
        --verify that dashboard text is visible
         */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");

        driver.findElement(By.id("rcc-confirm-button")).click();
        WebElement emailBtn = driver.findElement(By.id("loginpage-input-email"));
        emailBtn.click();
        emailBtn.sendKeys("eurotech@gmail.com");

        WebElement passwordBtn = driver.findElement(By.id("loginpage-form-pw-input"));
        passwordBtn.click();
        passwordBtn.sendKeys("Test12345!");
        Thread.sleep(1000);

        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
        Thread.sleep(1000);

        WebElement dashboard = driver.findElement(By.id("dashboard-h1"));
        String actualText= dashboard.getText();
        String expectedText="Dashboard";

        if (expectedText.equals(actualText)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        Thread.sleep(1000);
        driver.close();


    }
}
