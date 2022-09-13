import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import static org.hamcrest.Matchers.contains;

public class Mesa_Aula_17_1 {

    @Test
    public void givenThatIPerformAPostRequest_whenIGetTheResponseStatusCode_thenTheResponseStatusCodeIs200() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("thumbnail", "Hodor");
        jsonObject.put("name", "Hodor");
        jsonObject.put("realName", "Hodor");
        jsonObject.put("location", "Winterfell");
        jsonObject.put("isAlive", true);

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .body(jsonObject.toString())
                .when()
                .post("https://restool-sample-app.herokuapp.com/api/character")
                .then()
                .statusCode(200);
    }

    @Test
    public void givenThatIPerformAPostRequest_whenIGetTheResponseTime_thenTheResponseTimeIsBelow900() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("thumbnail", "Hodor");
        jsonObject.put("name", "Hodor");
        jsonObject.put("realName", "Hodor");
        jsonObject.put("location", "Winterfell");
        jsonObject.put("isAlive", true);

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .body(jsonObject.toString())
                .when()
                .post("https://restool-sample-app.herokuapp.com/api/character")
                .then()
                .time(lessThan(900L));
    }

    @Test
    public void givenThatIPerformAPostRequest_whenIGetTheResponseBody_thenTheResponseBodyContainsName() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("thumbnail", "Hodor");
        jsonObject.put("name", "Hodor");
        jsonObject.put("realName", "Hodor");
        jsonObject.put("location", "Winterfell");
        jsonObject.put("isAlive", true);
        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .body(jsonObject.toString())
                .when()
                .post("https://restool-sample-app.herokuapp.com/api/character")
                .then()
                .body("name", equalTo("Hodor"));
    }

    @Test
    public void givenThatIPerformAPutRequest_whenIGetTheResponseStatusCode_thenTheResponseStatusCodeIs200() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("location", "Kings Landing");

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .pathParam("id", "qtw21XN4NUai")
                .body(jsonObject.toString())
                .when()
                .put("https://restool-sample-app.herokuapp.com/api/character/{id}")
                .then()
                .statusCode(200);
    }

    @Test
    public void givenThatIPerformAPutRequest_whenIGetTheResponseTime_thenTheResponseTimeIsBelow900() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("location", "Kings Landing");

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .pathParam("id", "qtw21XN4NUai")
                .body(jsonObject.toString())
                .when()
                .put("https://restool-sample-app.herokuapp.com/api/character/{id}")
                .then()
                .time(lessThan(900L));
    }

    @Test
    public void givenThatIPerformAPutRequest_whenIGetTheResponseBody_thenTheResponseBodyIsOk() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("location", "Kings Landing");

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .pathParam("id", "qtw21XN4NUai")
                .body(jsonObject.toString())
                .when()
                .put("https://restool-sample-app.herokuapp.com/api/character/{id}")
                .then()
                .body("", contains("ok"));
    }

}
