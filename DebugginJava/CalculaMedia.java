import java.util.Scanner;


public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        int media = calculaMediaTurma (alunos, scan);

        System.out.println("Media da turma " + media);
    }

    public static int calculaMediaTurma ( String [] alunos, Scanner scanner) {
        int soma = 0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno " + aluno);
            int Nota = scanner.nextInt();
            soma += Nota;

        }

        return soma/alunos.length;

    }
    
}
