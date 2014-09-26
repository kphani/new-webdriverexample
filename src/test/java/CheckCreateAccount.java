import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by srinivas on 26/09/2014.
 */
public class CheckCreateAccount {
    WebDriver driver;
    GoogleRegistrationPage regPage;


    @Before
    public void setUp(){

        driver = new FirefoxDriver();
        regPage = new GoogleRegistrationPage(driver);

    }


    @Test
    public void checkBlankUserNameValidation() {
        regPage.firsName().sendKeys("srinu");
        regPage.lastName().sendKeys("lastname");
        regPage.gMailAddress().sendKeys("");
        regPage.password().sendKeys("Test122!");
        regPage.passwordConfirm().sendKeys("Test122!");
        regPage.birthMonth().sendKeys("May");
        regPage.birthDay().sendKeys("05");
        regPage.birthYear().sendKeys("1980");
        regPage.gender().sendKeys("Male");
        regPage.phoneNumber().sendKeys("07592266550");
        regPage.currentEmail().sendKeys("srinu@gmail.com");
        regPage.skipCaptcha().click();
        regPage.termsOfService().click();
        regPage.createAccountSubmitButton().click();
        Assert.assertEquals("You can't leave this empty.", regPage.getUserNameValidation());






    }


}
