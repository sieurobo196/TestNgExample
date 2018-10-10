package com.codewr.test.user;

import org.testng.annotations.Test;

public class TestRuntime {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        System.out.println("divisionWithException");
        int i = 1 / 0;
    }

}
