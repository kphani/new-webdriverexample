package edu.phani.selenium.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by kphani on 28/09/2014.
 */
public abstract class AbstractPage {
    WebDriver driver;

    public AbstractPage(WebDriver driver1) {
        this.driver = driver1;
    }

}
