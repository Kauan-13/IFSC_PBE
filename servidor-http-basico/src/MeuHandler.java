import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// Um tratador deve implementar a interface HttpHandler
class MeuHandler implements HttpHandler {

    // O método handle é chamado para processar uma requisição.
    // A requisição é representada por um objeto HttpExchange
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        // obtém um OutputStream para gerar o corpo da mensagem de resposta
        OutputStream outputStream = httpExchange.getResponseBody();

        Path base = 

        File arq = new File("/home/aluno/web/");

        StringBuilder htmlResponse = new StringBuilder();

        if (arq.isDirectory()) {
            File[] arqs = arq.listFiles();

            htmlResponse.append("<html> <body> <h1> Listagem de / </h1>");

            for (int i = 0; i < arqs.length; i++) {
                htmlResponse.append("<a href=''>").append(arqs[0].getName()).append("</a>");
            }

            htmlResponse.append("</body> </html>");

            Headers headers = httpExchange.getResponseHeaders();
            headers.set("Content-Type", "text/html");

            // Define o status da resposta, e o comprimento do corpo da mensagem  (em bytes)
            httpExchange.sendResponseHeaders(200, arq.length());

            // escreve o corpo da resposta
            outputStream.write(htmlResponse.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        } else {
            outputStream.write(Files.readAllBytes());
        }



    }
}