package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.ModeloConta;
import is.lell.prjatm.visao.TelaHome;

public class LoginCtrl {

	private static int status = 0;
	private static String statusText;

	public static void login(String numeroConta, int pin) {

		if(ModeloConta.login(numeroConta, pin) ) {

			status = 0;
			TelaHome.apresentar();

		} else {
			status = -1;
			statusText = ModeloConta.getStatusText();
		}
	}

	public static int getStatus() {
		return status;
	}

	public static String getStatusText() {
		return statusText;
	}
}
