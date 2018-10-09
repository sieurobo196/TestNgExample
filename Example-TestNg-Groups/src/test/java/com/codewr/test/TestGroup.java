package com.codewr.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestGroup {

    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }

    @Test(groups = "app-test")
    public void runApp() {
        System.out.println("runApp()");
    }

    @Test(groups = "app-test")
    public void runApp1() {
        System.out.println("runApp1()");
    }

    @Test(groups = "database")
    public void checkConnectOracle() {
        System.out.println("checkConnectOracle()");
    }

    @Test(groups = "database")
    public void checkConnectMsSQL() {
        System.out.println("checkConnectMsSQL()");
    }

    @Test(dependsOnGroups = {"database", "app-test"})
    public void runFinal() {
        System.out.println("runFinal()");
    }

}
