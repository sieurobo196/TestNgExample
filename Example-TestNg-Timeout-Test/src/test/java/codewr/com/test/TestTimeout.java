package codewr.com.test;

import java.util.Date;
import org.testng.annotations.Test;

/**
 *
 * @author codewr
 */
public class TestTimeout {

    @Test
    public void test1() {
        System.out.println("test1()");
    }

    @Test(timeOut = 5000) // time in mulliseconds
    public void test2() throws InterruptedException {
        System.out.println("test Pass " + new Date());
        Thread.sleep(4000);
        System.out.println("test Pass " + new Date());
    }

    @Test(timeOut = 5000) // time in mulliseconds
    public void test3() throws InterruptedException {
        System.out.println("test Fail " + new Date());
        Thread.sleep(5000);
        System.out.println("test Fail " + new Date());
    }

}
