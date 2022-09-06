import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Aula_16 {

    @Test
    public void test_01() {

        Response response = RestAssured.get("https://reqres.in/api/users");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());

        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 200);
    }
}
