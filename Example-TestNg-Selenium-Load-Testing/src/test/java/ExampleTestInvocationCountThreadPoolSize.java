
import org.testng.annotations.Test;

public class ExampleTestInvocationCountThreadPoolSize {
    // invocationCount: times TestNG  run this test method.
    // threadPoolSize:  number thread  run this test method.

    @Test(invocationCount = 10, threadPoolSize = 5)
    public void testThreadPools() {

        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }
}
