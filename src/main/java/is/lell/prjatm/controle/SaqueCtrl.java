package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.modelo.ContaService;


public class SaqueCtrl {
	
	private static String statusText;
	
	private static int status = 0;

	public static void sacar(double valorSaque, Conta conta) {
		
		status = conta.sacar(Math.abs(valorSaque) );
		statusText = conta.getStatusText();
	}
	
	public static String getStatusText () {
		return statusText;
	}
	
	public static int getStatus () {
		return status;
	}
}