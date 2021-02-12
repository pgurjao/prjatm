package is.lell.prjatm.visao;

import is.lell.prjatm.Dados;
import is.lell.prjatm.controle.LoginCtrl;
import is.lell.prjatm.controle.SaldoCtrl;

public class TelaSaldo {
	
	public static void apresentar() {
		System.out.println("=========================" + "\n" + 
				"Tela do Saldo \n \n");
		System.out.printf("O saldo da sua conta é: %.2f %n", SaldoCtrl.getSaldo() );
		
	}
	
	

}
