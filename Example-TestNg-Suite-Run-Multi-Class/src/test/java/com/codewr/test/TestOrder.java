
package com.codewr.test;

import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestOrder {

    @Test(testName = "testMakeOrder")
    public void testMakeOrder() {
        System.out.println("test Make Order");
    }

    @Test(testName = "testMakeEmptyOrder")
    public void testMakeEmptyOrder() {
        System.out.println("test Make Empty Order");
    }

    @Test(testName = "testUpdateOrder")
    public void testUpdateOrder() {
        System.out.println("test Update Order");
    }

    @Test(testName = "testFindOrder")
    public void testFindOrder() {
        System.out.println("test Find Order");
    }
}
