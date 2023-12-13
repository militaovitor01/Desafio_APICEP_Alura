package principal;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(String json) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter file = new FileWriter("cep.json");
        file.write(json);
        file.close();
    }
}