package com.eurotech.tests.day17_POM3;

import com.eurotech.tests.TestBase;
import com.eurotech.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.de/");
        driver.findElement(By.id("sp-cc-accept")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Konto und Listen')]/.."));
        Thread.sleep(1000);
        element.click();
        Thread.sleep(2000);
        //BrowserUtils.hover(element);
    }
}
