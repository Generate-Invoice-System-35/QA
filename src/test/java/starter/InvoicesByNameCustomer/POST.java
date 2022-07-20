package starter.InvoicesByNameCustomer;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "http://api.calorilin.me/";
    public static String token;

    @Step("user sent POST api search invoices by name customer endpoints")
    public String sentPostApiSearchInvoicesByNameCustomerEndpoints() {
        return url + "invoice/search";
    }

    @Step("user send POST name customer HTTP request")
    public void sendPostNameCustomerHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "prilaandini");

        SerenityRest.given().header("Authorization", "Bearer " + token).header("Content-Type", "application/json").when().get(sentPostApiSearchInvoicesByNameCustomerEndpoints());

    }

    @Step("user receive invalid search invoices by name custome HTTP response code 401")
    public void receiveInvalidSearchInvoicesByNameCustomerHttpResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("user receive valid data for search invoices by name customer")
    public void receiveInvalidDatafordearchInvoicesByNameCustomer() {
        Response resp = SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("datamv.Name");
        System.out.println("prilaandini : " + Name);
    }

}
