package com.eurotech.tests.day2_webdriver_basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        driver.quit();


    }
}
