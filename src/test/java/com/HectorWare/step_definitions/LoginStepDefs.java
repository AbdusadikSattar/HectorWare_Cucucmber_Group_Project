package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.BrowserUtils;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(3);

    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        new LoginPage().loginWithValid();
        BrowserUtils.waitFor(3);

    }

    @Then("Hectorware - QA page should be	Account {string} as title")
    public void hectorware_QA_page_should_be_Account_as_title(String expectedTitle) {
        BrowserUtils.waitFor(2);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals (Driver.get().getTitle(),expectedTitle);
        BrowserUtils.waitFor(3);

        new LoginPage().getUserName();
        new LoginPage().navigateToModule("Talk");
        new LoginPage().logOut();
    }

    @When("the user should not be able to login with invalid credentials")
    public void the_user_should_not_be_able_to_login_with_invalid_credentials() {
        new LoginPage().loginWithInvalid();
        BrowserUtils.waitFor(3);

    }

    @When("the user should not be able to login with blank username and password")
    public void the_user_should_not_be_able_to_login_with_blank_username_and_password() {
        new LoginPage().loginWithBlankUsernameAndPassword();
        BrowserUtils.waitFor(3);

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
       Assert.assertTrue(new LoginPage().warningMsg.isDisplayed());
       BrowserUtils.waitFor(3);
    }

    @And("the user should not be able to login with blank username")
    public void theUserShouldNotBeAbleToLoginWithBlankUsername() {
        new LoginPage().loginWithBlankUsername();
        BrowserUtils.waitFor(3);
    }

    @And("the user should not be able to login with blank password")
    public void theUserShouldNotBeAbleToLoginWithBlankPassword() {
        new LoginPage().loginWithBlankPassword();
        BrowserUtils.waitFor(3);

    }


    @Then("should not be blanked message should be displayed on username textBox")
    public void shouldNotBeBlankedMessageShouldBeDisplayedOnUsernameTextBox() {
        String displayMessage = "Please fill out this field.";
        String message = new LoginPage().usernameInput.getAttribute("validationMessage");
        System.out.println("message = " + message);
        Assert.assertEquals(displayMessage,message);
        BrowserUtils.waitFor(3);
    }

    @Then("should not be blanked message should be displayed on password textBox")
    public void shouldNotBeBlankedMessageShouldBeDisplayedOnPasswordTextBox() {
        String displayMessage = "Please fill out this field.";
        String message = new LoginPage().passwordInput.getAttribute("validationMessage");
        System.out.println("message = " + message);
        Assert.assertEquals(displayMessage,message);
        BrowserUtils.waitFor(3);

    }


}
