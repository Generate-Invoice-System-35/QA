package starter.InvoicesByPagination;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "http://api.calorilin.me/";
    public static String token;

    @Step("user sent POST api get invoices by pagination endpoints")
    public String sentPostApiGetInvoicesByPaginationEndpoints() {
        return url + "invoice/pagination";
    }

    @Step("user send POST get invoices by pagination  HTTP request")
    public void sendPostGetInvoicesByPaginationHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("page", "1");

        SerenityRest.given().header("Authorization", "Bearer " + token).header("Content-Type", "application/json").when().get(sentPostApiGetInvoicesByPaginationEndpoints());

    }

    @Step("user receive invalid  get invoices by pagination HTTP response code 401")
    public void receiveiInvalidGetInvoicesByPaginationHttpResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I receive invalid or expired jwt")
    public void receiveInvalidOrExpiredJwt() {
        Response resp = SerenityRest.lastResponse();
        String Page = resp.getBody().jsonPath().get("datamv.Page");
        System.out.println("1 : " + Page);
    }

}
