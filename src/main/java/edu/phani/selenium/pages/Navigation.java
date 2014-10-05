package edu.phani.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kphani on 28/09/2014.
 */
public class Navigation {
    WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }

    public Navigation toGoogleLandingPage() {
        driver.get("http://google.co.uk");
        return this;

    }

    public RegistrationPage toGMailRegistrationPage() {
        toGoogleLandingPage();
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.linkText("Create an account")).click();
        return new RegistrationPage(driver);
    }
}
