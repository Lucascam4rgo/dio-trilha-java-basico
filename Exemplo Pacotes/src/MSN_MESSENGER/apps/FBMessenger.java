package MSN_MESSENGER.apps;

public class FBMessenger extends ServicoPai {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
}
