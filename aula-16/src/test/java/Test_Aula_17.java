import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Aula_17 {

    @Test
    public void givenThatIPerformAGetRequest_whenIGetTheResponseStatusCode_thenTheResponseStatusCodeIs200() {

        //Given
        Response response = RestAssured.get("https://restool-sample-app.herokuapp.com/api/character");

        //When
        int statusCode = response.getStatusCode();
        System.out.println("Status code: " + statusCode);

        //Then
        Assertions.assertEquals(200, statusCode);
    }


}
