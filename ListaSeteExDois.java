import java.util.Scanner;

public class ListaSeteExDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverterPalavras reverter = new ReverterPalavras();

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();
        String nomeInvertido = reverter.inverterPalavra(nome);
        System.out.println("Seu nome ao contrário é: " + nomeInvertido);
        scanner.close();

    }
}