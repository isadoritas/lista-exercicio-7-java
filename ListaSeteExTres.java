import java.util.Scanner;

public class ListaSeteExTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de CPF no formato xxx.xxx.xxx-xx: ");
        String cpf = scanner.nextLine();

        CPF cpfObjeto = new CPF(cpf);

        if (cpfObjeto.validar()) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        scanner.close();
    }
}
