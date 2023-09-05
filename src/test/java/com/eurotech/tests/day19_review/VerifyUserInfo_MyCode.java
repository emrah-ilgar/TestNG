package com.eurotech.tests.day19_review;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.tests.TestBase;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUserInfo_MyCode extends TestBase {

    LoginPage loginPage=new LoginPage();
    @Test
    public void wrongPassword() throws InterruptedException {
        /*
--Login as a teacher
--Verify that login is successful
--Click on Edit Profile button
--Verify that Github name is eurotech2023
--Click on back button
--Verify that user's Apple company title is Test Automation Engineer

*/

        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage=new DashboardPage();

        extentLogger = report.createTest("TC001 Login Test - Verify user info");

        extentLogger.info("Go to url http://eurotech.study/login");
        driver.get(ConfigurationReader.get("url"));

        extentLogger.info("login as a teacher");
        loginPage.loginWithTeacher();

        String expectedText = "Welcome Teacher";
        String actualText = dashboardPage.welcomeMessage.getText();

        Assert.assertEquals(actualText, expectedText, "Login verification failed");
        dashboardPage.navigateMenu("Edit Profile");
        WebElement gobackk = driver.findElement(By.linkText("Go Back"));
        BrowserUtils.scrollToElement(gobackk);

        String expectedText2 = "eurotech2023";
        WebElement eurotech2023 = driver.findElement(By.xpath("//input[@value='eurotech2023']"));
        String actualText2=eurotech2023.getAttribute("value");
        Assert.assertEquals(expectedText2,actualText2);
        gobackk.click();
        Thread.sleep(2000);



        String expectedText3 = "Test Automation Engineer";
        String actualText3=driver.findElement(By.xpath("//td[text()='Test Automation Engineer']")).getText();
        Assert.assertEquals(expectedText3,actualText3);



    }
}
