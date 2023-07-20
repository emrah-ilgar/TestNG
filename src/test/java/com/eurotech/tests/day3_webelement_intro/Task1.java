package com.eurotech.tests.day3_webelement_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
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
        //enter username
        WebElement emailInput = driver.findElement(By.id("loginpage-input-email"));
        emailInput.sendKeys("eurotech@gmail.com");
        Thread.sleep(3000);

        //enter password
        WebElement passwordInput = driver.findElement(By.id("loginpage-form-pw-input"));
        passwordInput.sendKeys("Test12345!");
        Thread.sleep(3000);

        //click login button
        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
        Thread.sleep(3000);

        WebElement dashboardMessage = driver.findElement(By.id("dashboard-h1"));
        String actualText= dashboardMessage.getText();
        String expectedText="Dashboard";

        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);

        if (expectedText.equals(actualText)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        Thread.sleep(1000);
        driver.close();



    }
}
