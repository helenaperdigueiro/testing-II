import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Aula_17_2 {

    @Test
    public void givenThatIPerformAGetRequest_whenIGetTheResponseTime_thenTheResponseTimeIsBelow900() {

        //Given
        Response response = RestAssured.get("https://restool-sample-app.herokuapp.com/api/character");

        //When
        long responseTime = response.getTime();
        System.out.println(responseTime);

        //Then
        Assertions.assertTrue(responseTime < 900);

    }

}
