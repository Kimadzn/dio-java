public class MinhaClasse {
    public static void main (String [] args) {

        String primeiroNome = "Arthur";
        String segundoNome = "Xavier";

        String nomeCompleto = nomeCompletometo(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompletometo(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}


