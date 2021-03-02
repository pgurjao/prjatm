package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.modelo.ContaService;

public class DepositoCtrl {
	
	private static String statusText;
	
	private static int status = 0;

	public static void depositar(double valorDeposito, Conta conta) {

		status = conta.depositar(Math.abs(valorDeposito) );
		statusText = conta.getStatusText();
	}
	
	public static String getStatusText () {
		return statusText;
	}
	
	public static int getStatus () {
		return status;
	}
}
