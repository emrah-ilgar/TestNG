package com.eurotech.tests.day17_POM3;

import com.eurotech.pages.ApplePage;
import com.eurotech.tests.TestBase;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AppleTest extends TestBase {
    ApplePage applePage = new ApplePage();

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.apple.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        applePage.headerMenuName("Store").click();
        /*Thread.sleep(5000);
        BrowserUtils.hover(applePage.headerMenuName("Mac"));
        Thread.sleep(3000);
        BrowserUtils.hover(applePage.headerMenuName("TV &"));
        Thread.sleep(3000);*/

    }
}
