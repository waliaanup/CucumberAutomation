package step.def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
    @Given("^open the url$")
    public void openTheUrl() {

    }

    @When("^User is entering the valid credentials$")
    public void userIsEnteringTheValidCredentials() {
        System.out.println();
    }

    @And("^Click the login button$")
    public void clickTheLoginButton() {
        
    }

    @Then("^User should be able to login in the home page$")
    public void userShouldBeAbleToLoginInTheHomePage() {
        
    }

    @When("^User is entering the invalid credentials$")
    public void userIsEnteringTheInvalidCredentials() {
        
    }

    @Then("^User should not be able to login in the home page$")
    public void userShouldNotBeAbleToLoginInTheHomePage() {
    }
}
