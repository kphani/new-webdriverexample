package edu.phani.selenium.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import edu.phani.selenium.pages.RegistrationPage;

import java.util.Map;

/**
 * Created by kphani on 04/10/2014.
 */
public class GoogleCreateAccount extends AbstractTest {

    RegistrationPage regPage;

    @Given("^navigate to registration page$")
    public void clickGMailLink() throws Throwable {
        regPage = navigation.toGMailRegistrationPage();

    }

    @Given("^create new account with details as follows:$")
    public void createAccount(DataTable table) throws Throwable {
        Map<String, String> map = table.asMaps().get(0);
        regPage.setFirstName(map.get("firstName"))
                .setLastName(map.get("lastName"))
                .setGMailAddress(map.get("username"));


    }


}
