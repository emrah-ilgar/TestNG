package com.eurotech.tests.day7_TestNG;

import org.testng.annotations.Test;

public class firstTestNGTest {
    @Test
    public void test3(){
        System.out.println("My First Test Case");
    }
    @Test
    public void test2() throws InterruptedException {
        System.out.println("My second Test Case");
        Thread.sleep(3000);
    }

}
