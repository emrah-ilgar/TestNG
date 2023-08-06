package com.eurotech.tests.day5_xpath;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework_xpath {
    public static void main(String[] args) throws InterruptedException {
        /*
            Test Case 2
            go to ebay.com
            search selenium
            click on search button
            print number of results
           */

        //USE XPATH LOCATOR ONLY
        String product="selenium";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);


// 1       driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys(product);
// 2       driver.findElement(By.xpath("//input[@*=\"gh-ac\"]")).sendKeys(product);
// 3       driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(product);
// 4       driver.findElement(By.xpath("//*[@*=\"gh-ac\"][2]")).sendKeys(product);
// 5       driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(product);
// 6       driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]")).sendKeys(product);
// 7       driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys(product);
// 8       driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys(product);
// 9       driver.findElement(By.xpath("//input[@aria-expanded=\"true\"]")).sendKeys(product);
// 10      driver.findElement(By.xpath("//input[@size=\"50\"]")).sendKeys(product);
// 11      driver.findElement(By.xpath("//input[@maxlength=\"300\"]")).sendKeys(product);
// 12      driver.findElement(By.xpath("//input[@aria-label=\"Search for anything\"]")).sendKeys(product);
// 13      driver.findElement(By.xpath("//input[@placeholder=\"Search for anything\"]")).sendKeys(product);
// 14      driver.findElement(By.xpath("//input[@name=\"_nkw\"]")).sendKeys(product);
        //There are 9 ways too...
       // driver.findElement(By.xpath("//input[contains(@class,\"gh-tb ui-autocomplete-input\")]")).sendKeys(product);
        driver.findElement(By.xpath("//input[starts-with(@class,\"gh-tb ui-a\")]")).sendKeys(product);




        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        // WAY 2--> driver.findElement(By.xpath("//input[@type=\"submit\" or @id=\"gh-btn\"]")).click();
        // WAY 3-->driver.findElement(By.xpath("//input[@type=\"submit\" and @id=\"gh-btn\"]")).click();
        Thread.sleep(1000);

        //WAY 1:
        /*WebElement resultText1 = driver.findElement(By.xpath("//h1[contains(@class,'srp-controls__count-heading')]/span[1]"));
        String resultNumber1 = resultText1.getText();
        System.out.println("resultNumber1 = " + resultNumber1);*/

        //WAY 2:
        /*WebElement resultText2 = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span[1]"));
        String resultNumber2 = resultText2.getText();
        System.out.println("resultNumber2 = " + resultNumber2);*/

        //WAY 3:
        WebElement resultText3 = driver.findElement(By.xpath("//h1[starts-with(@class,'srp-cont')]/span[1 ]"));
        String resultNumber3 = resultText3.getText();
        System.out.println("resultNumber3 = " + resultNumber3);

        Thread.sleep(1000);
        driver.close();




    }
}
