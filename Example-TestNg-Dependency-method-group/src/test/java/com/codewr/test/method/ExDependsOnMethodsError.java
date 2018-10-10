package com.codewr.test.method;

/**
 *
 * @author codewr
 */
import org.testng.annotations.Test;

public class ExDependsOnMethodsError {
    // if method1 is fail method2 will be skipped

    @Test
    public void method1() {
        System.out.println("This is method 1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"method1"})
    public void method2() {
        System.out.println("This is method 2");
    }

}
