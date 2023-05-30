public class NumeroPorExtensoConverter {
    public String converterParaExtenso(int numero) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezADezenove = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

        if (numero >= 0 && numero < 10) {
            return unidades[numero];
        } else if (numero >= 10 && numero < 20) {
            return dezADezenove[numero - 10];
        } else if (numero >= 20 && numero < 100) {
            int dezena = numero / 10;
            int unidade = numero % 10;
            if (unidade == 0) {
                return dezenas[dezena];
            } else {
                return dezenas[dezena] + " e " + unidades[unidade];
            }
        }
        return ""; // Retorno padrão caso o número esteja fora do intervalo
    }
}
