import org.junit.Assert;
import org.junit.Test;

public class AutomationTests {

    //Performing the first test that checks if the site's homepage appears
    @Test
    public void Test1(){
        AutomationProject AP= new AutomationProject("C:\\Users\\97250\\Desktop\\chromedriver.exe");
        Assert.assertEquals(AP.GetUrlTest(), "http://automationpractice.com/index.php?");
    }

    //Performing the second test that checks if the site's title appears after the registration
    @Test
    public void Test2() throws InterruptedException {
        AutomationProject AP= new AutomationProject("C:\\Users\\97250\\Desktop\\chromedriver.exe");
        Assert.assertEquals(AP.GetTitleTest(), "My account - My Store");


    }

}