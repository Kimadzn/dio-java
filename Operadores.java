public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);
        for (int i = 0; i < 10 ; i++){
            numero = ++numero;
            System.out.println(numero);
        }

        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);

    }

}

