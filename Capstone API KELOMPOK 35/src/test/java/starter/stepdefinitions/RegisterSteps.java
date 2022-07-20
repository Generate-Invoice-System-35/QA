package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Register.POST;

public class RegisterSteps {
    @Steps
    POST post;

    @Given("user sent POST api register invalid email endpoints")
    public void sentPostApiRegisterInvalidEmailEndpoints() {
        post.sentPostApiRegisterInvalidEmailEndpoints();
    }

    @When("user send POST register invalid email HTTP request")
    public void sendPostRegisterInvalidEmailHttpRequest() {
        post.sendPostRegisterInvalidEmailHttpRequest();
    }

    @Then("user receive invalid register HTTP response code 417")
    public void receiveInvalidRegisterHttpResponse() {
        post.receiveInvalidRegisterHttpResponse();
    }

    @And("user received a message username exist")
    public void receivedAMessageUsernameExist() {
        post.receivedAMessageUsernameExist();

    }
}
