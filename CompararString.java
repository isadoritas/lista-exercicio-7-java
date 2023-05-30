public class CompararString {
    private String stringUm;
    private String stringDois;

    public String getStringUm() {
        return stringUm;
    }

    public void setStringUm(String stringUm) {
        this.stringUm = stringUm;
    }

    public String getStringDois() {
        return stringDois;
    }

    public void setStringDois(String stringDois) {
        this.stringDois = stringDois;
    }

    public void compararTamanho() {
        int tamanhoString1 = stringUm.length();
        int tamanhoString2 = stringDois.length();

        System.out.println("Tamanho de \"" + stringUm + "\": " + tamanhoString1 + " caracteres");
        System.out.println("Tamanho de \"" + stringDois + "\": " + tamanhoString2 + " caracteres");

        if (tamanhoString1 != tamanhoString2) {
            System.out.println("As duas strings são de tamanhos diferentes");
        } else {
            System.out.println("As duas strings são de tamanhos iguais");
        }
    }

    public void compararConteudo() {
        if (stringUm.equals(stringDois)) {
            System.out.println("As duas strings possuem conteúdo igual");
        } else {
            System.out.println("As duas strings possuem conteúdo diferente");
        }
    }
}


    
