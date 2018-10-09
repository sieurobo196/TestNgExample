
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author codewr
 */
public class EX1_TestParameterDataProvider {

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {

        return new Object[][]{
            {2, 20},
            {3, 30},
            {20, 200}
        };
    }

    @Test(dataProvider = "provideNumbers")
    public void testOK(int number, int expected) {
        System.out.println("test OK");
        Assert.assertEquals(number * 10, expected);
    }

    @Test(dataProvider = "provideNumbers")
    public void testFail(int number, int expected) {
        System.out.println("test Fail");
        Assert.assertNotEquals(number * 4, expected);
    }

}
