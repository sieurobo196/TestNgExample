
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTestInvocationCount {
//    invocationCount determined how many times TestNG should run this test method


    @Test(invocationCount = 5)
    public void loadTestThisWebsite() {

        String urlweb = "http://www.codewr.com/";
        System.out.println("This is " + urlweb);
        Assert.assertEquals("http://www.codewr.com/", urlweb);

    }

   
}
