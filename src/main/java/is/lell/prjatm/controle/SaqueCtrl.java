package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.ModeloConta;

public class SaqueCtrl {
	
	private static String statusText;
	
	private static int status = 0;

	public static void sacar(double valorSaque) {
		
		status = ModeloConta.sacar(Math.abs(valorSaque) );

		if (status != 0 ) {
			statusText = ModeloConta.getStatusText();
		}
	}
	
	public static String getStatusText () {
		return statusText;
	}
	
	public static int getStatus () {
		return status;
	}
}