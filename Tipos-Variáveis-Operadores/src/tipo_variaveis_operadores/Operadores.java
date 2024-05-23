package tipo_variaveis_operadores;

public class Operadores {
	public static void main(String[] args) {
		// classe Operadores.java
		String nomeCompleto = "LINGUAGEM" + "JAVA";

		//////////////////////////////////////////////

		// qual o resultado das expressoes abaixo?
		String concatenacao = "?";

		System.out.println(concatenacao);

		concatenacao = 1 + 1 + 1 + "1";

		System.out.println(concatenacao);

		concatenacao = 1 + "1" + 1 + 1;

		System.out.println(concatenacao);

		concatenacao = 1 + "1" + 1 + "1";

		System.out.println(concatenacao);

		concatenacao = "1" + 1 + 1 + 1;

		System.out.println(concatenacao);

		concatenacao = "1" + (1 + 1 + 1);

		System.out.println(concatenacao);

		System.out.println("*****************************");

		//////////////////////////////////////////////

		int numero = 5;

		numero = -numero;

		System.out.println(numero);

		numero = numero * -1;

		System.out.println(numero);

		System.out.println("*****************************");

		//////////////////////////////////////////////

		// int numero2 = 8;

		// System.out.println(numero2 ++);

		// System.out.println(++ numero2);

		// System.out.println(numero2);

		// System.out.println(numero2 --);

		// System.out.println(numero2);
		// x repeticao

		//////////////////////////////////////////////

		boolean variavel = true;

		variavel = !variavel;

		System.out.println(variavel);

		System.out.println("*****************************");

		//////////////////////////////////////////////

		int a, b;

		a = 5;
		b = 6;

		String resultado = a == b ? "verdadeiro" : "falso";

		System.out.println(resultado);

		System.out.println("*****************************");

		/*
		 * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE if(a==b) resultado =
		 * "verdadeiro"; else resultado = "falso";
		 * 
		 * System.out.println(resultado);
		 */

		////////////////////////////////////////////////

		String nomeUm = "Lucas";
		String nomeDois = new String("Lucas");

		System.out.println(nomeUm.equals(nomeDois));// true

		// System.out.println(nomeUm == nomeDois);false, porque o == compara o lugar da
		// memória
		// e porque 1 e 2 são referências diferentes
		// Seria igual se fosse "Lucas" == "Lucas",
		// System.out.println(nomeUm.equals(nomeDois)) ou
		// System.out.println(new String("Lucas").equals(new String("Lucas"))
		// Falso se fosse new String("Lucas") == new String("Lucas") também porque os
		// dois objetos não estão
		// no mesmo lugar da memória

		int numero3 = 1;
		int numero4 = 2;

		boolean simNao = numero3 == numero4;

		if (numero3 == numero4) {
			System.out.println("A nossa condição é verdadeira");
		}

		System.out.println("numeroTrês é igual a numeroQuatro? " + simNao);

		simNao = numero3 != numero4;

		System.out.println("numeroTrês é igual a numeroQuatro? " + simNao);

		simNao = numero3 > numero4;

		System.out.println("numeroTrês é igual a numeroQuatro? " + simNao);

		System.out.println("*****************************");

		//////////////////////////////////////////////////////

		boolean condicao1 = true;

		boolean condicao2 = false;

		if (condicao1 && (7 > 4)) {
			System.out.println("As duas condições são verdadeiras");
		}

		if (condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}

		System.out.println("fim");

	}

}
