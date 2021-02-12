package is.lell.prjatm.visao;

import java.util.Scanner;

import is.lell.prjatm.Dados;
import is.lell.prjatm.controle.HomeCtrl;
import is.lell.prjatm.controle.LoginCtrl;
import is.lell.prjatm.modelo.ModeloConta;

public class TelaHome {
	
	public static void apresentar () {
		
		int escolha = -1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo(a), " + ModeloConta.getClientName() + "\n");
		System.out.println("Main menu \n");
		System.out.println("     1- View my balace");
		System.out.println("     2- Withdraw cash");
		System.out.println("     3- Deposit funds");
		System.out.println("     4- Exit");
		System.out.print("\n Enter a choice: ");
		
		escolha = sc.nextInt();
		
		HomeCtrl.apresentar(escolha);
		sc.close();
	}

}
