package is.lell.prjatm.visao;

import is.lell.prjatm.modelo.ModeloConta;

public class TelaSaldo {
	
	public static void apresentar() {
		System.out.println("========================="
				+ "\n"
				+ "Tela do Saldo"
				+ "\n"
				+ "\n");
		System.out.printf("O saldo da sua conta é: %.2f %n", ModeloConta.getSaldo() );
		
	}
}
