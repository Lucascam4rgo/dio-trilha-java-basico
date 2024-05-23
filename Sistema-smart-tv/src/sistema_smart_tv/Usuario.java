package sistema_smart_tv;

public class Usuario {
	public static void main(String[] args) throws Exception {
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuir();
		smartTv.diminuir();
		smartTv.diminuir();
		smartTv.diminuir();
		smartTv.diminuir();
		smartTv.diminuir();
		
		smartTv.escolherCanal(28);
		smartTv.aumentarCanal();
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual? " + smartTv.canal);
		System.out.println("Volume Atual? " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
		
	}
}
