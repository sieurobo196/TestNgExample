package com.codewr.test;

import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestOrder {

    @Test(testName = "testMakeOrder" ,groups = "back")
    public void testMakeOrder() {
        System.out.println("test Make Order");
    }

    @Test(testName = "test Make Empty Order",groups = "back")
    public void testMakeEmptyOrder() {
        System.out.println("test Make Empty Order");
    }

    @Test(testName = "testUpdateOrder",groups = "back")
    public void testUpdateOrder() {
        System.out.println("test Update Order");
    }

    @Test(testName = "test Find Order",groups = "front")
    public void testFindOrder() {
        System.out.println("test Find Order");
    }
}
