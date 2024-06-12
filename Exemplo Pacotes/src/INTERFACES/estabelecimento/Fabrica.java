package INTERFACES.estabelecimento;

import INTERFACES.equipamentos.copiadora.Copiadora;
import INTERFACES.equipamentos.copiadora.Xerox;
import INTERFACES.equipamentos.digitalizadora.Digitalizadora;
import INTERFACES.equipamentos.digitalizadora.Scanner;
import INTERFACES.equipamentos.impressora.Deskjet;
import INTERFACES.equipamentos.impressora.Impressora;
import INTERFACES.equipamentos.impressora.Laserjet;
import INTERFACES.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		//Impressora impressora = new Laserjet() ou new Deskjet();
		//Digitalizadora digitalizadora = new Scanner();
		//Copiadora copiadora = new Xerox();
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		
		digitalizadora.digitalizar();
		
		copiadora.copiar();
	}
}
