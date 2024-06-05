package controle_fluxo;

public class PlanoOperadora {
	public static void main(String[] args) {

		// If/Else
		/*
		 * String plano = "M"; // M / T
		 * 
		 * if (plano == "B") { System.out.println("100 minutos de ligação"); } else if
		 * (plano == "M") { System.out.println("100 minutos de ligação");
		 * System.out.println("WhatsApp e Instagram grátis"); } else if (plano == "T") {
		 * System.out.println("100 minutos de ligação");
		 * System.out.println("WhatsApp e Instagram grátis");
		 * System.out.println("5Gb Youtube"); }
		 */

		// Switch Case
		// String plano = "M"; // M / T

		// switch (plano) {
		// case "T": {
		// System.out.println("5Gb Youtube");
		// }
		// case "M": {
		// System.out.println("WhatsApp e Instagram grátis");
		// }
		// case "B": {
		// System.out.println("100 minutos de ligação");
		// }
		// }

		for (int x = 0; x < 10; x++) {
			if (x == 6)
				continue;
			if (x == 8)
				break;
			switch (x) {
			case 0:
				System.out.println("zero");
				continue;
			case 1:
				System.out.println("um");
				continue;
			case 2:
				System.out.println("dois");
				break;
			default:
				System.out.println(x);
				break;
			}
		}

	}
}