package com.eurotech.tests.day16_POM2;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.tests.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import com.eurotech.utilities.BrowserUtils;
import java.util.ArrayList;



public class DashboardTest extends TestBase {
    /*
Navigate to http://eurotech.study/login
Login with teacher credentials
Get the text of the dashboard menu list
Verify that menu list is
Developers
All Posts
My Account
*/
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    @Test
    public void testName1(){
        driver.get(ConfigurationReader.get("url"));
        loginPage.understandBtn.click();
        loginPage.usernameInput.sendKeys("eurotech@gmail.com");
        loginPage.passwordInput.sendKeys("Test12345!");
        loginPage.loginBtn.click();

        List<WebElement> menuList = driver.findElements(By.xpath("//ul[@id='navbar-menu-list2']"));

        for (WebElement menu:menuList){
            System.out.println("MenuList : "+menu.getText());
        }


    }
    /*
Navigate to http://eurotech.study/login
Login with teacher credentials
Navigate to All Posts menu and verify that url is http://eurotech.study/posts
Navigate to Developers menu and verify that url is http://eurotech.study/profiles
*/
    @Test
    public void navigateMenu1(){
        driver.get(ConfigurationReader.get("url"));
        loginPage.loginWithTeacher();

        WebElement allPosts = driver.findElement(By.xpath("//a[text()='All Posts']"));
        allPosts.click();

        String currentUrl = driver.getCurrentUrl();
        String expectedUrlAllPosts="http://eurotech.study/posts";

        Assert.assertEquals(currentUrl,expectedUrlAllPosts);

        WebElement developers = driver.findElement(By.xpath("//a[text()='Developers']"));
        developers.click();

        String currentUrl2=driver.getCurrentUrl();
        String expectedUrlDevelopers="http://eurotech.study/profiles";
        Assert.assertEquals(currentUrl2,expectedUrlDevelopers);

    }
    @Test
    public void testName() {

        /*
        Navigate to http://eurotech.study/login
        Login with teacher credentials
        Get the text of the dashboard menu list
        Verify that menu list is
                    Developers
                    All Posts
                    My Account
         */
        //10 min

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginWithTeacher();

        String expectedText= "Welcome Teacher";
        Assert.assertEquals(dashboardPage.welcomeMessage.getText(),expectedText);
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Developers");
        expectedList.add("All Posts");
        expectedList.add("My Account");

        //1 way
        ArrayList<String> actualList = new ArrayList<>();
        List<WebElement> dashboardMenu = dashboardPage.menuList;
        for (WebElement menu : dashboardMenu) {
            //    System.out.println("menu.getText() = " + menu.getText());
            actualList.add(menu.getText());
        }
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(actualList,expectedList);

        //2 way
        List<String> actualList1 = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(actualList1,expectedList);

        //3 way
        Assert.assertEquals(BrowserUtils.getElementsText(dashboardPage.menuList),expectedList);

    }

    @Test
    public void navigateMenu() {

        /*
        Navigate to http://eurotech.study/login
        Login with teacher credentials
        Navigate to All Posts menu and verify that url is http://eurotech.study/posts
        Navigate to Developers menu and verify that url is http://eurotech.study/profiles
         */

        //10 min

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginWithTeacher();
        Assert.assertEquals(dashboardPage.welcomeMessage.getText(),"Welcome Teacher");


        dashboardPage.allPost.click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://eurotech.study/posts");

        dashboardPage.developers.click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://eurotech.study/profiles");


    }

    @Test
    public void navigate2() {
        driver.get(ConfigurationReader.get("url"));
        loginPage.loginWithTeacher();
        Assert.assertEquals(dashboardPage.welcomeMessage.getText(),"Welcome Teacher");

        dashboardPage.navigateMenu("All Posts");
        Assert.assertEquals(driver.getCurrentUrl(),"http://eurotech.study/posts");

        dashboardPage.navigateMenu("Developers");
        Assert.assertEquals(driver.getCurrentUrl(),"http://eurotech.study/profiles");

    }

    @Test
    public void navigate3() {

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginWithTeacher();
        Assert.assertEquals(dashboardPage.welcomeMessage.getText(),"Welcome Teacher");

        dashboardPage.navigateSubMenu("My Posts");

        dashboardPage.navigateSubMenu("Logout");



    }
}
