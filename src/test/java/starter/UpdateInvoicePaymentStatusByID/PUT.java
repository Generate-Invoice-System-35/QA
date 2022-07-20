package starter.UpdateInvoicePaymentStatusByID;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PUT {
    protected String url = "http://api.calorilin.me/";

    @Step("user sent PUT update invoice payment status by id endpoints")
    public String sentPutUpdateInvoicePaymentStatusByIdEndpoints() {
        return url + "invoice-payment-status/2";
    }

    @Step("user send PUT update invoice payment status by id HTTP request")
    public void sendPutUpdateinvoicePaymentStatusByIdHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", "0");
        requestBody.put("name", "Prila");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(sentPutUpdateInvoicePaymentStatusByIdEndpoints());
    }

    @Step("user receive invalid update invoice payment status by id HTTP response code 400")
    public void receiveInvalidUpdateinvoicePaymentStatusByIdHttpResponse() {
        restAssuredThat(response -> response.statusCode(400));

    }

    @Step("user received a message invalid or expired jwt on update invoice payment status by id")
    public void receivedAMessageInvalidOrExpiredJwtOnUpdateinvoicePaymentStatusById() {
        Response resp =SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("datamv.Name");
        System.out.println("Prila : " + Name);
    }
}
