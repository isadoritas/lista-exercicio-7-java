public class Telefone {
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public boolean validar() {
        String numeroSemFormatacao = removerFormatacao();
        return numeroSemFormatacao.length() == 8;
    }

    public void corrigir() {
        if (!validar()) {
            numero = "9" + removerFormatacao();
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getNumeroFormatado() {
        String numeroSemFormatacao = removerFormatacao();
        return numeroSemFormatacao.substring(0, 5) + "-" + numeroSemFormatacao.substring(5);
    }

    private String removerFormatacao() {
        return numero.replace("-", "").replace(" ", "");
    }
}
