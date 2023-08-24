package com.eurotech.tests.day13_WebTables;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables2 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void test(){
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.findElement(By.cssSelector("button#ez-accept-all")).click();
        List<WebElement> headers=driver.findElements(By.xpath("(//tr[@style='margin:0;padding:0'])[3]"));
        System.out.println(headers.size());

        for (WebElement header:headers){
            System.out.println(header.getText());
        }
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
