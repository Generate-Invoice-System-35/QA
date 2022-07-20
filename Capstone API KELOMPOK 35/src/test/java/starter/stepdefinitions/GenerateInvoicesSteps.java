package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.GenerateInvoices.POST;

public class GenerateInvoicesSteps {

    @Steps
    POST post;

    @Given("user sent POST api generate invoices endpoints")
    public void sentPostApiGenerateInvoicesEndpoints() {
        post.sentPostApiGenerateInvoicesEndpoints();
    }

    @When("user send POST generate invoices HTTP request")
    public void sendPostGenerateInvoicesHttpRequest() {
        post.sendPostGenerateInvoicesHttpRequest();
    }

    @Then("user receive valid generate invoices HTTP response code 405")
    public void receiveValidGenerateInvoicesHttpResponse() {
        post.receiveValidGenerateInvoicesHttpResponse();
    }

    @And("user received a message generate invoices success")
    public void receivedAMessageGenerateInvoicesSuccess() {
        post.receivedAMessageGenerateInvoicesSuccess();

    }
}

