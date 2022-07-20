package starter.Register;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "http://api.calorilin.me/";

    @Step("user sent POST api register invalid email endpoints")
    public String sentPostApiRegisterInvalidEmailEndpoints() {
        return url + "register";
    }

    @Step("user send POST register invalid email HTTP request")
    public void sendPostRegisterInvalidEmailHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "prilandin");
        requestBody.put("password", "ndinstama");
        requestBody.put("name", "Prila Andini");
        requestBody.put("email", "prilaandin12ab@gmail.com");
        requestBody.put("phone_number", "0824124312");
        requestBody.put("address", "Jalan Solo");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(sentPostApiRegisterInvalidEmailEndpoints());
    }

    @Step("user receive invalid register HTTP response code 417")
    public void receiveInvalidRegisterHttpResponse() {
        restAssuredThat(response -> response.statusCode(417));

    }

    @Step("user received a message username exist")
    public void receivedAMessageUsernameExist() {
        Response resp = SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("datamv.Name");
        System.out.println("Prila Andini : " + Name);
    }
}
