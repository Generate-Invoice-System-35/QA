package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.InvoicesByNameCustomer.POST;

public class InvoicesByNameCustomerSteps {
    @Steps
    POST post;

    @Given("user sent POST api search invoices by name customer endpoints")
    public void sentPostApiSearchInvoicesByNameCustmerEndpoints() {
        post.sentPostApiSearchInvoicesByNameCustomerEndpoints();
    }

    @When("user send POST name customer HTTP request")
    public void sendPostNameCustomerHttpRequest() {
        post.sendPostNameCustomerHttpRequest();
    }

    @Then("user receive invalid search invoices by name custome HTTP response code 401")
    public void receiveInvalidSearchInvoicesByNameCustomerHttpResponse() {
        post.receiveInvalidSearchInvoicesByNameCustomerHttpResponse();
    }

    @And("user receive invalid data for search invoices by name customer")
    public void receiveInvalidDatafordearchInvoicesByNameCustomer() {
        post.receiveInvalidDatafordearchInvoicesByNameCustomer();

    }
}
