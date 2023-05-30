public class ReverterPalavras {

    public String inverterPalavra(String nome) {
        StringBuilder nomeRevertido = new StringBuilder(nome);
        return nomeRevertido.reverse().toString();
    }
}
