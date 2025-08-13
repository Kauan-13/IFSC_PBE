import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://ftp.unicamp.br/pub/"))
                .GET()
                .build();

        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.printf("Status: %d\n", response.statusCode());
        System.out.printf("Headers: %s\n", response.headers().map());
        System.out.printf("Corpo: %s\n", response.body());
    }
}