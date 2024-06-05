package controle_fluxo;

public class ExemploForArray {
	public static void main(String[] args) {
		
		//em arrays o índice começa em 0
		String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
		System.out.println(alunos.length);
		
		/*Forma mais longa
		 * 
		 * for (int x=0; x < alunos.length; x++) {
			System.out.println("O aluno no índice " + x + " é " + alunos[x]);
		}*/
		
		//Forma mais abreviada
		for(String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
	}
}
