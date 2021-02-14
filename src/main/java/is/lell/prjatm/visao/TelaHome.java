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
		System.out.println("Menu principal \n");
		System.out.println("     1- Ver saldo");
		System.out.println("     2- Sacar dinheiro");
		System.out.println("     3- Depositar dinheiro");
		System.out.println("     4- Sair \n");
		System.out.print("\n Enter a choice: ");
		
		escolha = sc.nextInt();
		
		HomeCtrl.apresentar(escolha);
		sc.close();
	}

}
