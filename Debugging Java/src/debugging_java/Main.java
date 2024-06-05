package debugging_java;

public class Main {
	public static void main(String[] args) {
		
		//Em cada método é adicionado uma camada na pilha
		System.out.println("Iniciou do programa no método main.");
		a(); //Pilha [Main, A]
		System.out.println("Finalizou do programa no método main.");
	}

	static void a() {
		System.out.println("Entrou no método a.");
		b();//Pilha [Main, A, B]
		System.out.println("Finalizou o método a.");
	}

	static void b() {
		System.out.println("Entrou no método b.");
		for (int i = 0; i <= 4; i++)
			System.out.println(i);
		c();//Pilha [Main, A, B, C]
		System.out.println("Finalizou o método b.");
	}

	static void c() {
		System.out.println("Entrou no método c.");
		Thread.dumpStack();// mostra a Stack Trace
		// A partir daqui a pilha [Main, A, B, C] começa a desempilhar
		//Terminando do método C até o Main
		//No Java, o metódo main sempre vai terminar por último
		System.out.println("Finalizou o método c.");
	}
}
