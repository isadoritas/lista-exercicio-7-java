import java.util.Scanner;

public class ListaSeteExUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompararString comparar = new CompararString();

        System.out.println("Digite a primeira frase:");
        String stringUm = scanner.nextLine();
        comparar.setStringUm(stringUm);

        System.out.println("Digite a segunda frase:");
        String stringDois = scanner.nextLine();
        comparar.setStringDois(stringDois);

        comparar.compararTamanho();
        comparar.compararConteudo();
    }
}
