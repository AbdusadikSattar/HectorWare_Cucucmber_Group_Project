package com.HectorWare.step_definitions;

import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.BrowserUtils;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {

        String username = ConfigurationReader.get("valid_username");
        String password = ConfigurationReader.get("valid_password");
        LoginPage loginPage =new LoginPage();
        loginPage.login(username,password);
    }

    @Then("Hectorware - QA page should be	Account {string} as title")
    public void hectorware_QA_page_should_be_Account_as_title(String expectedTitle) {
        BrowserUtils.waitFor(2);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals (Driver.get().getTitle(),expectedTitle);
    }


}
