package INTERFACES.multifuncional;

import INTERFACES.equipamentos.copiadora.Copiadora;
import INTERFACES.equipamentos.digitalizadora.Digitalizadora;
import INTERFACES.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
	}

	
	public void imprimir() {
		
		System.out.println("Imprimindo via equipamento multifuncional");
	}

	public void digitalizar() {
		
		System.out.println("Digitalizando via equipamento multifuncional");
		
	}
	
}
