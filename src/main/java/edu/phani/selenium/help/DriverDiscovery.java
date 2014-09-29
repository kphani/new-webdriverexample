package edu.phani.selenium.help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kphani on 27/09/2014.
 */
public class DriverDiscovery {
    public static WebDriver driver;

    static {
        driver = new FirefoxDriver();

    }



}
