package is.lell.prjatm.telas;

import java.util.Scanner;

import is.lell.prjatm.controle.LoginCtrl;

public class TelaLogin {
	
	private static String numeroConta;
	
	private static int pin = 0;
	
	public static void apresentar () {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo \n\n");
		System.out.print("Por favor digite o número da conta: ");
		numeroConta = sc.nextLine();

		System.out.print("\n \n Por favor digite o PIN: ");
		pin = sc.nextInt();
		sc.close();
		LoginCtrl.login(numeroConta,pin);
	}

	public static String getNumeroConta() {
		return numeroConta;
	}

	public static int getPin() {
		return pin;
	}
}
