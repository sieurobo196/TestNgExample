
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex3_TestParameterDataProvider {

    @Test(dataProvider = "dataProvider")
    public void testNumber(int number, int expected) {
        Assert.assertEquals(number, expected);
    }

    @Test(dataProvider = "dataProvider")
    public void testEmail(String email, String expected) {
        Assert.assertEquals(email, expected);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(Method method) {

        Object[][] result = null;

        if (method.getName().equals("testNumber")) {
            result = new Object[][]{
                {1, 1}, {200, 200}
            };
        } else if (method.getName().equals("testEmail")) {
            result = new Object[][]{
                {"test@gmail.com", "test@gmail.com"},
                {"test@codewr.com", "test@codewr.com"}
            };
        }

        return result;

    }
}
