package is.lell.prjatm.telas;

import is.lell.prjatm.Dados;
import is.lell.prjatm.controle.LoginCtrl;

public class TelaSaldo {
	
	public static void apresentar() {
		System.out.println("=========================" + "\n" + 
				"Tela do Saldo \n \n");
		System.out.println("O saldo da sua conta é: " + Dados.saldos[LoginCtrl.getIndiceConta()]);
		
	}

}
