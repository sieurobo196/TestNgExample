package com.codewr.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//use to @BeforeSuite and @BeforeTest
public class TestConfig {

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("Test BeforeSuite()");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("Test AfterSuite()");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("Test BeforeTest()");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("Test AfterTest()");
    }

}
