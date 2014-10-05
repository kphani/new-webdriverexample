package edu.phani.selenium.stepdefinitions;

import edu.phani.selenium.help.DriverDiscovery;
import edu.phani.selenium.pages.Navigation;
import org.junit.AfterClass;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by kphani on 28/09/2014.
 */
public abstract class AbstractTest {
    final static RemoteWebDriver driver = DriverDiscovery.getDriver();
    public Navigation navigation = new Navigation(driver);


    //Will used by Junit Test
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
