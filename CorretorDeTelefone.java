public class CorretorDeTelefone {
    public telefone(String telefone) {
        this.telefone = telefone[];
    }
    private String corrigirTelefone(String telefone) {
        String numeroSemHifen = telefone.replaceAll("-", "");
        System.out.println("O número de telefone possui" + numeroSemHifen.length());

        if(numeroSemHifen.length() < 9) {
            return "9" + telefone;
        }
        System.out.println("Número de telefone: " + numeroSemHifen);
    }

}