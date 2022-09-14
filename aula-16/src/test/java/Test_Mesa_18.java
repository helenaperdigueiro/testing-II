import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test_Mesa_18 {

    @Test
    public void givenThatIPerformAGetRequest_whenIGetTheResponseStatusCode_thenTheResponseStatusCodeIs200() {

        //Given
        Response response = RestAssured.get("https://pokeapi.co/api/v2/pokemon/ditto/");

        //When
        int statusCode = response.getStatusCode();
        System.out.println("Status code: " + statusCode);

        //Then
        Assertions.assertEquals(200, statusCode);
    }

    @Test
    public void givenThatIPerformAPostRequest_whenIGetTheResponseCode_thenTheResponseBodyContainsOUTPUTAllInCapsLock() throws IOException {

        String jsonObject = Files.readString(Path.of("src/test/object1.json"));

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .body(jsonObject)
                .when()
                .post("HTTP://API.SHOUTCLOUD.IO/V1/SHOUT")
                .then()
                .statusCode(200)
                .body("OUTPUT", equalTo("BANANA"));


    }
}
