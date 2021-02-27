package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.modelo.ContaService;
import is.lell.prjatm.modelo.ModeloDatabase;
import is.lell.prjatm.visao.TelaHome;

public class LoginCtrl {

	private static int status = 0;
	private static String statusText;

	public static void login(String numeroConta, int pin) {

		ModeloDatabase.inicializar();
		
		Conta conta = new Conta();
		
		if(ContaService.login(numeroConta, pin) ) {

			status = 0;
			statusText = Conta.getStatusText();
			TelaHome.apresentar();

		} else {
			status = -1;
			statusText = Conta.getStatusText();
		}
	}

	public static int getStatus() {
		return status;
	}

	public static String getStatusText() {
		return statusText;
	}
}
