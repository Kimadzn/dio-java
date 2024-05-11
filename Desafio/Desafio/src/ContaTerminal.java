import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int Numero = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha
        System.out.println("Por favor, digite o nome do cliente !");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o número !");
        String agencia = sc.nextLine();067-2
        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + Numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
