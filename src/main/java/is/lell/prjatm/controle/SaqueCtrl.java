package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.Conta;

public class SaqueCtrl {
	
	private static String statusText;
	
	private static int status = 0;

	public static void sacar(double valorSaque) {
		
		status = Conta.sacar(Math.abs(valorSaque) );

		if (status != 0 ) {
			statusText = Conta.getStatusText();
		}
	}
	
	public static String getStatusText () {
		return statusText;
	}
	
	public static int getStatus () {
		return status;
	}
}