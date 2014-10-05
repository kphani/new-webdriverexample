package edu.phani.selenium.stepdefinitions;

import cucumber.api.java.After;

/**
 * Created by kphani on 04/10/2014.
 */
public class Hooks extends AbstractTest {

    //Hooks used by Cucumber Test
    @After
    public static void tearDown() {
        System.out.println("Quitting driver");
        driver.quit();
    }

}
