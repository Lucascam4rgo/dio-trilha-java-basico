package MSN_MESSENGER.pedrinho;

import MSN_MESSENGER.apps.FBMessenger;
import MSN_MESSENGER.apps.MSNMessenger;
import MSN_MESSENGER.apps.ServicoPai;
import MSN_MESSENGER.apps.TLMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoPai sp = null;
		
		
		/*
		 * NÃO SE SABE QUAL APP
		 * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		
		String appEscolhido = "tl";
		
		if (appEscolhido.equals("msn")) {
			sp = new MSNMessenger();
		}
		else if (appEscolhido.equals("fb")) {
			sp = new FBMessenger();
		}
		else if (appEscolhido.equals("tl")) {
			sp = new TLMessenger();
		}
		
		sp.enviarMensagem();
		sp.receberMensagem();
		
	}
}
