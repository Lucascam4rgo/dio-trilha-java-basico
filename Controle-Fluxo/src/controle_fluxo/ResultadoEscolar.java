package controle_fluxo;

public class ResultadoEscolar {
	public static void main(String[] args) {
		
		//Condicionais Compostas e Encadeadas
		
		int nota = 6;
		
		if (nota >= 7)
			System.out.println("Aprovado");
		
		else if (nota > 5 && nota < 7)
			System.out.println("Recuperação");
		
		else
			System.out.println("Reprovado");
		
		/*Ternário
		 * String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		 * 
		 * String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
		 * System.out.println(resultado);
		 */
		
	}
}
