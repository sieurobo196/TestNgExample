package com.codewr;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestHelloWorld {

    @Test()
    public void testStringRandom() {

        System.out.println("Test String Random");
        RandomStringGenerator obj = new RandomStringGenerator();
        String textStr = obj.generate();
        Assert.assertNotNull(textStr);
        Assert.assertEquals(textStr, "Hello World");

    }
}
