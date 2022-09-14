import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;

public class Test_Aula_18 {

    @Test
    public void givenThatIPerformAPostRequest_whenIGetTheResponseCode_thenTheResponseStatusCodeIs200() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("thumbnail", "https://i.pinimg.com/originals/dc/ab/b7/dcabb7fbb2f763d680d20a3d228cc6f9.jpg");
        jsonObject.put("name", "Pikachu IV");
        jsonObject.put("realName", "chuchu");
        jsonObject.put("location", "Japan");
        jsonObject.put("isAlive", true);

        String jsonObject2 = Files.readString(Path.of("src/test/object.json"));

        given()
                .header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .body(jsonObject2)
                .when()
                .post("https://restool-sample-app.herokuapp.com/api/character")
                .then()
                .statusCode(200);
    }
}