package MSN_MESSENGER.apps;

public abstract class ServicoPai {
	public abstract void enviarMensagem();

	public abstract void receberMensagem();
	
	//public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
