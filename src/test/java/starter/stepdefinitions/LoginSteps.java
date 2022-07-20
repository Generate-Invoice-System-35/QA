package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login.POST;

public class LoginSteps {
    @Steps
    POST post;

    @Given("user sent POST api login endpoints")
    public void sentPostApiLoginEndpoints() {

        post.sentPostApiLoginEndpoints();
    }

    @When("user send POST login  HTTP request")
    public void sendPostLoginHttpRequest() {
        post.sendPostLoginHttpRequest();

    }

    @Then("user receive invalid login HTTP response code 401")
    public void receiveInvalidLoginHttpResponse() {
        post.receiveInvalidLoginHttpResponse();
    }

    @And("user receive a message wrong username or password")
    public void receiveAMessageWrongUsernameOrPassword() {
        post.receiveAMessageWrongUsernameOrPassword();

    }
}
