package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main (String [] args) {
		
	imprimirSelecionados();
		
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		System.out.println(" Imprimindo a Lista de candidatos informando o indice do elemento ");
		for(int indice = 0; indice < candidatos.length ; indice++) {
			System.out.println(" O candidato de nº " + (indice + 1 ) + " é " + candidatos[indice]);

		}
		
		System.out.println(" Forma abreviada for each ");
		
		for(String candidato : candidatos) {
			System.out.println(" O candidato selecionado foi: " + candidato);

		}

	}
	
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto" , "Monica", "Mirela", "Daniela", "Jorge"};
		int candidatosSelecionados = 0;
		double salarioBase = 2000.0;
		int canditadoAtual = 0;
		while(candidatosSelecionados < 5 && canditadoAtual < candidatos.length) {
			String candidato = candidatos [canditadoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou esse valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato +" foi selecionado para vaga ");

				candidatosSelecionados++;
			}
			canditadoAtual++;
		}
	}
	
	static double valorPretendido () {
		
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato ");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra-proposta ");
			
		}else {
			System.out.println("Aguardando mais candidatos ");
		}
	}
}
