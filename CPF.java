public class CPF {
    private String numero;

    public CPF(String numero) {
        this.numero = numero;
    }

    public boolean validar() {
        String cpfSemFormatacao = removerFormatacao(numero);

        if (cpfSemFormatacao.length() != 11) {
            return false;
        }

        return validarDigitosVerificadores(cpfSemFormatacao);
    }

    private String removerFormatacao(String cpf) {
        return cpf.replaceAll("\\D", "");
    }

    private boolean validarDigitosVerificadores(String cpf) {
        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));

            soma1 += digito * (10 - i);
            soma2 += digito * (11 - i);
        }

        int digitoVerificador1 = Character.getNumericValue(cpf.charAt(9));
        int digitoVerificador2 = Character.getNumericValue(cpf.charAt(10));

        soma2 += digitoVerificador1 * 2;

        int resto1 = soma1 % 11;
        int resto2 = soma2 % 11;

        int resultado1 = (resto1 < 2) ? 0 : 11 - resto1;
        int resultado2 = (resto2 < 2) ? 0 : 11 - resto2;

        return resultado1 == digitoVerificador1 && resultado2 == digitoVerificador2;
    }
}
