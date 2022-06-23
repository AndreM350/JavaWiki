package TesteDeApi1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class getRequest {
    public static void main(String[] args) throws IOException, InterruptedException {

        String URL_GET = "https://httpbin.org/get";

        //Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        
        //Requisição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_GET))
                .build();

        //enviando a solicitação
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        //imprimir o resultado
        System.out.println(response.statusCode());
        System.out.println("--------------------");
        System.out.println(response.body());


    }

}
