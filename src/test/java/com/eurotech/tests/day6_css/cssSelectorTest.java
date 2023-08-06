package com.eurotech.tests.day6_css;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cssSelectorTest {
    /*

     Setup browser
     navigate to the "http://eurotech.study/login"
     locate email, passwrod, login button, confirm cookies button with CSS
     enter email, password and login
     close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://eurotech.study/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button#rcc-confirm-button")).click();

        driver.findElement(By.cssSelector("input#loginpage-input-email")).sendKeys("eurotech@gmail.com");
        //driver.findElement(By.cssSelector("input[placeholder*='Email']")).sendKeys("eurotech@gmail.com");
        //driver.findElement(By.cssSelector("div>input[type^='emai'")).sendKeys("eurotech@gmail.com");

        driver.findElement(By.cssSelector("input#loginpage-form-pw-input")).sendKeys("Test12345!");

        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
