package starter.Register1;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "http://api.calorilin.me/";

    @Step("user sent POST api register valid email endpoints")
    public String sentPostApiRegisterValidEmailEndpoints() {
        return url + "register";
    }

    @Step("user send POST register Valid email HTTP request")
    public void sendPostRegisterValidEmailHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "prilllllla");
        requestBody.put("password", "ndinstama");
        requestBody.put("name", "Prila Andini");
        requestBody.put("email", "prilaandin12ab@gmail.com");
        requestBody.put("phone_number", "0824124312");
        requestBody.put("address", "Jalan Solo");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(sentPostApiRegisterValidEmailEndpoints());
    }

    @Step("user receive valid register HTTP response code 201")
    public void receiveValidRegisterHttpResponse() {
        restAssuredThat(response -> response.statusCode(201));

    }

    @Step("user received a message success")
    public void receivedAMessageSuccess() {
        Response resp =SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("datamv.Name");
        System.out.println("Prila Andini : " + Name);
    }
}

