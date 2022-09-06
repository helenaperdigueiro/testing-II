import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mesa_Aula_16 {

    @Test
    public void test_mesa() {

        //Given
        Response response = RestAssured.get("https://api.openweathermap.org/data/2.5/weather?q=Curitiba&appid=f548280284dd2a302a401bb70d0f272a&units=metric");

        //When
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

        //Then
        int statusCode = response.getStatusCode();
        Assertions.assertEquals(200, statusCode);

    }
}
