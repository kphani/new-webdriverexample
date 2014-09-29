package edu.phani.selenium.tests;

import edu.phani.selenium.help.DriverDiscovery;
import edu.phani.selenium.pages.Navigation;
import org.junit.AfterClass;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by kphani on 28/09/2014.
 */
public class BaseTest {
    final static RemoteWebDriver driver = DriverDiscovery.getDriver();

    Navigation navigation = new Navigation(driver);


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
