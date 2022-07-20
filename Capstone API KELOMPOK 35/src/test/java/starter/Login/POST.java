package starter.Login;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "http://api.calorilin.me/";

    @Step("user sent POST api login endpoints")
    public String sentPostApiLoginEndpoints() {
        return url + "login";
    }

    @Step("user send POST login  HTTP request")
    public void sendPostLoginHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "prila");
        requestBody.put("password", "ndinstama");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(sentPostApiLoginEndpoints());

    }

    @Step("user receive invalid login HTTP response code 401")
    public void receiveInvalidLoginHttpResponse() {
        restAssuredThat(response -> response.statusCode(401));

    }

    @Step("user receive a message wrong username or password")
    public void receiveAMessageWrongUsernameOrPassword() {
        Response resp = SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("datamv.Name");
        System.out.println("prila: " + Name);
    }

}
