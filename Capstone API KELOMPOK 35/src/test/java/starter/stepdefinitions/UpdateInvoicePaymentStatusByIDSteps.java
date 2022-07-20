package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.UpdateInvoicePaymentStatusByID.PUT;

public class UpdateInvoicePaymentStatusByIDSteps {
    @Steps
    PUT put;

    @Given("user sent PUT update invoice payment status by id endpoints")
    public void sentPutUpdateInvoicePaymentStatusByIdEndpoints() {
        put.sentPutUpdateInvoicePaymentStatusByIdEndpoints();
    }

    @When("user send PUT update invoice payment status by id HTTP request")
    public void sendPutUpdateinvoicePaymentStatusByIdHttpRequest() {
        put.sendPutUpdateinvoicePaymentStatusByIdHttpRequest();
    }

    @Then("user receive invalid update invoice payment status by id HTTP response code 400")
    public void receiveInvalidUpdateinvoicePaymentStatusByIdHttpResponse() {
        put.receiveInvalidUpdateinvoicePaymentStatusByIdHttpResponse();
    }

    @And("user received a message invalid or expired jwt on update invoice payment status by id")
    public void receivedAMessageInvalidOrExpiredJwtOnUpdateinvoicePaymentStatusById() {
        put.receivedAMessageInvalidOrExpiredJwtOnUpdateinvoicePaymentStatusById();

    }

}
