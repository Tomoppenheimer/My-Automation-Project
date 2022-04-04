import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Defining a new class
public class AutomationProject {

    private String url;

    //Defining the constructor
    public AutomationProject(String url) {
        this.url = url;

    }

    //Defining the first function that returns the site's homepage URL
    public String GetUrlTest() {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.com/index.php");
        return driver.getCurrentUrl();
    }

    //Defining the second function that returns the site's title after the registration
    public String GetTitleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();

        //Step 1: entering the website
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.com/index.php");
        Thread.sleep(10000);

        //Step 2: clicking the SignIn button
        WebElement SignInBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        SignInBtn.click();
        Thread.sleep(10000);

        //Step 3: Entering the Email address
        WebElement EmailTextBox = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        EmailTextBox.sendKeys("foo1301@gmail.com");
        Thread.sleep(10000);

        //Step 4: clicking the "create an account" button
        WebElement CreateAnAcc = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        CreateAnAcc.click();
        Thread.sleep(10000);

        //Step 5: Picking a title
        WebElement Title = driver.findElement(By.id("id_gender2"));
        Title.click();
        Thread.sleep(10000);

        //Step 6: Entering first name.
        WebElement FN = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input"));
        FN.sendKeys("Foo");
        Thread.sleep(5000);

        //Step 7: Entering Last name.
        WebElement LN = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        LN.sendKeys("Zoo");
        Thread.sleep(7000);

        //Step 8: Entering password.
        WebElement PW = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        PW.sendKeys("FooZoo");
        Thread.sleep(5000);

        // Step 9: Entering date of birth.
        // 9.1: Choosing day of birth.
        WebElement DOB = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        DOB.click();
        Thread.sleep(10000);
        //9.2: selecting day number 1.
        WebElement SDOB = driver.findElement(By.xpath("//*[@id=\"days\"]/option[3]"));
        SDOB.click();
        Thread.sleep(5000);
        //9.3: Choosing month of birth.
        WebElement MOB = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        MOB.click();
        Thread.sleep(5000);
        //9.4: selecting month number 2.
        WebElement SMOB = driver.findElement(By.xpath("//*[@id=\"months\"]/option[3]"));
        SMOB.click();
        Thread.sleep(5000);
        //9.5: Choosing year of birth.
        WebElement YOB = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        YOB.click();
        Thread.sleep(5000);
        //9.6: Selecting year option
        WebElement SYOB = driver.findElement(By.xpath("//*[@id=\"years\"]/option[32]"));
        SYOB.click();
        Thread.sleep(5000);

        // Step 10: Entering an address.
        WebElement ADD = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        ADD.sendKeys("Dizzingof 100");
        Thread.sleep(5000);

        //Step11: Entering a city.
        WebElement CITY = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        CITY.sendKeys("Scranton");
        Thread.sleep(5000);

        //Step 12: Selecting a state.
        WebElement STATE = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
        STATE.click();
        Thread.sleep(5000);
        //Step 12.1 : Choosing a state.
        WebElement SSTATE = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[40]"));
        SSTATE.click();
        Thread.sleep(5000);

        //Step 13: Entering a zipcode.
        WebElement ZCODE = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        ZCODE.sendKeys("52362");
        Thread.sleep(5000);

        //Step 14: Entering a phone number.
        WebElement MP = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        MP.sendKeys("0502217788");
        Thread.sleep(5000);

        //Step 15: Clicking on the register button.
        WebElement Reg = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        Reg.click();
        return driver.getTitle();

    }

}