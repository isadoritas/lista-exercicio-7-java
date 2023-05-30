import java.util.Scanner;
import NumeroPorExtensoMain;

public class NumeroPorExtensoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 99: ");
        int numero = scanner.nextInt();
        
        NumeroPorExtensoConverter conversor = new NumeroPorExtensoConverter();
        String numeroExtenso = conversor.converterParaExtenso(numero);
        
        System.out.println("Número por extenso: " + numeroExtenso);
        scanner.close();
    }
}
