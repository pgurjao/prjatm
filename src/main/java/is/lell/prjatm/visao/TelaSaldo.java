package is.lell.prjatm.visao;

import is.lell.prjatm.controle.SaldoCtrl;
import is.lell.prjatm.modelo.Conta;

public class TelaSaldo {
	
	public static void apresentar(Conta conta) {
		
		System.out.print("========================="
				+ "\n"
				+ "Saldo"
				+ "\n"
				+ "\n");
		System.out.printf("O saldo da sua conta é: %.2f %n", SaldoCtrl.saldo(conta) );
		System.out.println("=========================\n");
	}
}
