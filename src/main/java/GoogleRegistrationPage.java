import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Srinivas on 26/09/2014.
 */
public class GoogleRegistrationPage {
WebDriver driver ;

    public GoogleRegistrationPage(WebDriver driver){
        this.driver=driver;
        driver.get("http://google.co.uk");
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.linkText("Create an account")).click();

    }

    public WebElement firsName(){
        return  driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName(){
        return  driver.findElement(By.id("LastName"));

    }

    public WebElement gMailAddress(){
        return  driver.findElement(By.id("GmailAddress"));
    }
    public WebElement password(){
        return  driver.findElement(By.id("Passwd"));
    }
    public WebElement passwordConfirm(){
        return  driver.findElement(By.id("PasswdAgain"));
    }

    public WebElement birthMonth(){
        return  driver.findElement(By.cssSelector("#BirthMonth div"));
    }

    public WebElement birthDay(){
        return  driver.findElement(By.id("BirthDay"));


    }
    public WebElement birthYear(){
        return  driver.findElement(By.id("BirthYear"));
    }

    public WebElement gender(){
        return  driver.findElement(By.cssSelector("#Gender div"));
    }

    public WebElement phoneNumber(){
        return  driver.findElement(By.id("RecoveryPhoneNumber"));
    }

    public WebElement currentEmail(){
        return  driver.findElement(By.id("RecoveryEmailAddress"));
    }

    public WebElement skipCaptcha(){
        return  driver.findElement(By.id("SkipCaptcha"));
    }

    public WebElement termsOfService(){
        return  driver.findElement(By.id("TermsOfService"));
    }
    public WebElement createAccountSubmitButton(){
        return  driver.findElement(By.id("submitbutton"));
    }

    public String getUserNameValidation(){
        return driver.findElement(By.cssSelector("#username-errormsg-and-suggestions span")).getText();
    }


}
