import edu.phani.selenium.pages.RegistrationPage;
import edu.phani.selenium.stepdefinitions.AbstractTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kphani on 26/09/2014.
 */
public class CreateAccountJunitTest extends AbstractTest {
    RegistrationPage regPage;


    @Before
    public void initPages() {
        regPage = navigation.toGMailRegistrationPage();
    }


    @Test
    public void checkBlankUserNameValidation() {
        regPage.setFirstName("srinu")
                .setLastName("lastname")
                .setGMailAddress("")
                .setPassword("Test122!")
                .setPasswordConfirm("Test122!")
                .setBirthMonth("May")
                .setBirthDay("05")
                .setBirthYear("1980")
                .setGender("Female")
                .setPhoneNumber("07592266550")
                .setCurrentEmail("srinu@gmail.com")
                .skipCaptcha()
                .acceptTermsOfService()
                .submitRegistrationForm();
        Assert.assertEquals("You can't leave this empty.", regPage.getUserNameValidation());


    }


}
