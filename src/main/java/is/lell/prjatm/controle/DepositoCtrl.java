package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.ModeloConta;

public class DepositoCtrl {
	
	private static String statusText;
	
	private static int status = 0;

	public static void depositar(double valorDeposito) {
		
		status = ModeloConta.depositar(Math.abs(valorDeposito ) );

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
