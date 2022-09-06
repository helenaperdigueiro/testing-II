import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Test_Aula_16_2 {

    @Test
    public void givenRequestWithNoAcceptHeader_whenRequestIsExecuted_thenDefaultResponseContentTypeisJson() throws ClientProtocolException, IOException {

        //Given
        String jsonMimeType = "application/json";
        HttpUriRequest uriRequest = new HttpGet("https://api.openweathermap.org/data/2.5/weather?q=Curitiba&appid=f548280284dd2a302a401bb70d0f272a&units=metric");

        //When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(uriRequest);

        //Then
        String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType();
        Assertions.assertEquals(jsonMimeType, mimeType);
    }
}
