/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.test;

import org.testng.annotations.Test;

/**
 *
 * @author NXCOMM
 */
public class TestDatabase {

    @Test(testName = "test ConnectDB")
    public void testConnectDB() {
        System.out.println("Test Connect Database");
    }

    @Test(testName = "testConnectOracle", dependsOnMethods = "testConnectDB")
    public void testConnectOracle() {
        System.out.println("Test Connect Oracle()");
    }

    @Test(testName = "testConnectMsSQL", dependsOnMethods = "testConnectOracle")
    public void testConnectMsSQL() {
        System.out.println("Test Connect MsSQL");
    }

    @Test(testName = "testConnectMongoDB", dependsOnMethods = "testConnectMsSQL")
    public void testConnectMongoDB() {
        System.out.println("Test Connect MongoDB");
    }

}
