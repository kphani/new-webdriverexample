import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kphani on 28/09/2014.
 */
public class Navigation {
    WebDriver driver;
    public Navigation(WebDriver driver){
        this.driver=driver;
    }

    public RegistrationPage toRegistrationPage(){
        driver.get("http://google.co.uk");
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.linkText("Create an account")).click();
        return new RegistrationPage(driver);
    }
}
