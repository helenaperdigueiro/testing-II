import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Mesa_Aula_17_2 {

    @Test
    public void givenThatIPerformAGetRequest_whenIGetTheResponse_thenTheResponseMatches() {

        given()
                .when()
                .get("https://restool-sample-app.herokuapp.com/api/character")
                .then()
                .body("items[1].name", equalTo("Rhaenyra Targaryen"))
                .body("items[1].realName", equalTo("Emma D'Arcy"))
                .body("items[1].location", equalTo("Kings Landing"));
    }
}
