package com.codewr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestHelloWorld {

    @Test()
    public void testEmailGenerator() {

        RandomStringGenerator obj = new RandomStringGenerator();
        String textStr = obj.generate();

        Assert.assertNotNull(textStr);
        Assert.assertEquals(textStr, "Hello World");

    }
}
