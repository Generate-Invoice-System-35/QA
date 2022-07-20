package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Register1.POST;

public class Register1Steps {
    @Steps
    POST post;

    @Given("user sent POST api register valid email endpoints")
    public void sentPostApiRegisterValidEmailEndpoints() {

        post.sentPostApiRegisterValidEmailEndpoints();
    }

    @When("user send POST register valid email HTTP request")
    public void sendPostRegisterValidEmailHttpRequest() {

        post.sendPostRegisterValidEmailHttpRequest();
    }

    @Then("user receive valid register HTTP response code 201")
    public void receiveValidRegisterHttpResponse() {

        post.receiveValidRegisterHttpResponse();
    }

    @And("user received a message success")
    public void receivedAMessageSuccess() {
        post.receivedAMessageSuccess();

    }
}
