public class Main {
    public static void main(String[] args) {
        String numeroTelefone = "7777-7777";
        
        Telefone telefone = new Telefone(numeroTelefone);
        
        if (!telefone.validar()) {
            System.out.println("Telefone possui 8 dígitos.");
            telefone.corrigir();
            System.out.println("Vou acrescentar o dígito 9 na frente.");
        }
        
        System.out.println("Telefone corrigido sem formatação: " + telefone.getNumero());
        System.out.println("Telefone corrigido com formatação: " + telefone.getNumeroFormatado());
    }
}
