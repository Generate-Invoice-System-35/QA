package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    HomeScreen homeScreen;

    @Given("android user on home screen")
    public void androidUserOnLandingScreen() {
        boolean actual = homeScreen.showHomeScreen();
        Assert.assertTrue(actual);
    }

    @When("android user click button sign in")
    public void androidUserClickSignIn() {
        homeScreen.tapSignInButton();
    }

    @And("android user input valid username")
    public void androidUserInputUsername() {
        loginScreen.inputUsername("ervitowijaya");
    }

    @And("android user input valid password")
    public void androidUserInputPassword() {
        loginScreen.inputPassword("jayavito");
    }

    @And("android user click sign in")
    public void androidUserSignInButton(){
        loginScreen.tapLoginButton();
    }

    @Then("android user go to homepage")
    public void androidUserOnHomeScreen() {
        boolean actual = homeScreen.showHomeScreen();
        Assert.assertTrue(actual);
    }
}
