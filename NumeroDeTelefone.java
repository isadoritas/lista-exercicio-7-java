import java.util.Scanner;
public class NumeroDeTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(Stystem.in);
        CorretorDeTelefone corrigir = new CorretorDeTelefone();
        System.out.println("Digite o número de telefone");
        String telefone = scanner.nextLine();
        telefone(telefone);
        corrigir.corrigirTelefone(telefone)
    }
}