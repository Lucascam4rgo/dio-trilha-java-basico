package sistema_smart_tv;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentar() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuir() {
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void escolherCanal(int novoCanal) {
		canal = novoCanal;
		
	}

}


