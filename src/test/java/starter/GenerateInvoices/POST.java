package starter.GenerateInvoices;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "http://api.calorilin.me/";
    public static String token;

    @Step("user sent POST api generate invoices endpoints")
    public String sentPostApiGenerateInvoicesEndpoints() {
        return url + "generate/invoices";
    }

    @Step("user send POST generate invoices HTTP request")
    public void sendPostGenerateInvoicesHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("ids", "1, 2, 3, 4");

        SerenityRest.given().header("Authorization", "Bearer " + token).header("Content-Type", "application/json").when().get(sentPostApiGenerateInvoicesEndpoints());


    }

    @Step("user receive valid generate invoices HTTP response code 405")
    public void receiveValidGenerateInvoicesHttpResponse() {
        restAssuredThat(response -> response.statusCode(405));

    }

    @Step("user received a message generate invoices success")
    public void receivedAMessageGenerateInvoicesSuccess() {
        Response resp = SerenityRest.lastResponse();
        String Ids = resp.getBody().jsonPath().get("datamv.Ids");
        System.out.println("1, 2, 3, 4 : " + Ids);
    }

}