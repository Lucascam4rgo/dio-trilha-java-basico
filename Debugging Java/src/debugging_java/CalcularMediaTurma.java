package debugging_java;

import java.util.Scanner;

public class CalcularMediaTurma {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Lucas", "Giovanna", "Maria", "Carlos"};
		
		double media = CalcularMediaDaTurma(alunos, scan);
		
		System.out.println("Média da sala: " + media);
				
	}

	public static double CalcularMediaDaTurma(String[] alunos, Scanner scanner) {
		double soma = 0;
		for (String aluno : alunos) {
			System.out.println("Nota do aluno " + aluno + ": ");
			double nota = scanner.nextDouble();
			soma += nota;
		
		}
		
		return soma / alunos.length;
	}

}
