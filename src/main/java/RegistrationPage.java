import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Srinivas on 26/09/2014.
 */
public class RegistrationPage extends AbstractPage {

    public RegistrationPage(WebDriver driver1) {
        super(driver1);
    }

    public RegistrationPage setFirstName(String firstName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        return this;

    }

    public RegistrationPage setGMailAddress(String gMailAddress) {
        driver.findElement(By.id("GmailAddress")).sendKeys(gMailAddress);
        return this;
    }

    public RegistrationPage setPassword(String pwd) {
        driver.findElement(By.id("Passwd")).sendKeys(pwd);
        return this;
    }

    public RegistrationPage setPasswordConfirm(String pwdConfirm) {
        driver.findElement(By.id("PasswdAgain")).sendKeys(pwdConfirm);
        return this;
    }

    public RegistrationPage setBirthMonth(String birthMonth) {

        driver.findElement(By.cssSelector("#BirthMonth div")).sendKeys(birthMonth);
        return this;
    }

    public RegistrationPage setBirthDay(String birthDay) {
        driver.findElement(By.id("BirthDay")).sendKeys(birthDay);
        return this;
    }

    public RegistrationPage setBirthYear(String year) {

        driver.findElement(By.id("BirthYear")).sendKeys(year);
        return this;
    }

    public RegistrationPage setGender(String gender1) {
        driver.findElement(By.cssSelector("#Gender div")).sendKeys(gender1);
        return this;
    }


    public RegistrationPage setPhoneNumber(String phoneNumber) {
        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(phoneNumber);
        return this;
    }

    public RegistrationPage setCurrentEmail(String email) {
        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(email);
        return this;
    }

    public RegistrationPage skipCaptcha() {
        driver.findElement(By.id("SkipCaptcha")).click();
        return this;
    }

    public RegistrationPage acceptTermsOfService() {
        driver.findElement(By.id("TermsOfService")).click();
        return this;
    }

    public RegistrationPage submitRegistrationForm() {
        driver.findElement(By.id("submitbutton")).click();
        return this;
    }

    public String getUserNameValidation() {
        return driver.findElement(By.cssSelector("#username-errormsg-and-suggestions span")).getText();
    }


}
