package com.codewr.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestIgnore {

    @Test //default enable=true
    public void test1() {
        System.out.println("run test1()");
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("run test2()");
        Assert.assertEquals(true, true);
    }

    @Test(enabled = true)
    public void test3() {
        System.out.println("run test3()");
        Assert.assertEquals(true, true);
    }

}
