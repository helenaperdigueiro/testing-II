import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Aula_17_3 {

    @Test
    public void givenThatIPerformADeleteRequest_whenIGetTheResponseBodyContent_thenTheResponseBodyContentIsOk() {

        //Given
        Response response = RestAssured.delete("https://restool-sample-app.herokuapp.com/api/character/123");

        //When
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        //Then
        Assertions.assertEquals("ok", responseBody);

    }
}
