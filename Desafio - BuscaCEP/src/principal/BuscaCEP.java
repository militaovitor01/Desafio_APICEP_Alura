package principal;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCEP {

    private String CEP;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void fazRequisicao() throws IOException, InterruptedException {

        // Processo de requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + this.CEP + "/json/"))
                .build();

        // Processo de resposta
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        geradorDeArquivo.salvaJson(json);
    }
}
