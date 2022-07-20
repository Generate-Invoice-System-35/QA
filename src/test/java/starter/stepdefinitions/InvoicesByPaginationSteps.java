package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.InvoicesByPagination.POST;

public class InvoicesByPaginationSteps {
    @Steps
    POST post;

    @Given("user sent POST api get invoices by pagination endpoints")
    public void sentPostApiGetInvoicesByPaginationEndpoints() {
        post.sentPostApiGetInvoicesByPaginationEndpoints();
    }

    @When("user send POST get invoices by pagination  HTTP request")
    public void sendPostGetInvoicesByPaginationHttpRequest() {
        post.sendPostGetInvoicesByPaginationHttpRequest();
    }

    @Then("user receive invalid  get invoices by pagination HTTP response code 401")
    public void receiveInvalidGetInvoicesByPaginationHttpResponse() {
        post.receiveiInvalidGetInvoicesByPaginationHttpResponse();
    }

    @And("I receive invalid or expired jwt")
    public void receiveInvalidOrExpiredJwt() {
        post.receiveInvalidOrExpiredJwt();

    }
}