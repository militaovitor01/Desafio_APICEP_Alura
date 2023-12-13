package principal;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        BuscaCEP BuscaCep = new BuscaCEP();

        try {
            System.out.println("Digite seu CEP!");
            BuscaCep.setCEP(scan.nextLine());
            BuscaCep.fazRequisicao();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}