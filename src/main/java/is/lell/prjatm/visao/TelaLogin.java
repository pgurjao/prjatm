package is.lell.prjatm.visao;

import java.util.Scanner;

import java.util.Locale;

import is.lell.prjatm.controle.LoginCtrl;

public class TelaLogin {
	
	public static void apresentar () {

		Locale.setDefault(Locale.US);
		String numeroConta;
		int pin = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo \n\n");
		System.out.print("Por favor digite o número da conta: ");
		numeroConta = sc.nextLine();
		
		System.out.print("Por favor digite o PIN: ");
		pin = sc.nextInt();
		System.out.println("");
		
		LoginCtrl.login(numeroConta,pin);
		
		if (LoginCtrl.getStatus() != 0 ) {
			System.out.println("Erro: " + LoginCtrl.getStatusText() );
		}
		
		sc.close();
		
	}
}
