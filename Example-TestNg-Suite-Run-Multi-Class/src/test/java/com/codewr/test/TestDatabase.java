package com.codewr.test;

import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestDatabase {

    @Test(groups = "db")
    public void testConnectDB() {
        System.out.println("Test Connect Database");
    }

    @Test(groups = "db")
    public void testConnectOracle() {
        System.out.println("Test Connect Oracle()");
    }

    @Test(groups = "db")
    public void testConnectMsSQL() {
        System.out.println("Test Connect MsSQL");
    }

    @Test(groups = "db-nosql")
    public void testConnectMongoDB() {
        System.out.println("Test Connect MongoDB");
    }

}
