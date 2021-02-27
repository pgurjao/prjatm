package is.lell.prjatm.visao;

//import java.util.Scanner;

import is.lell.prjatm.controle.HomeCtrl;
import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.modelo.Conta;

public class TelaHome {

	public static void apresentar() {

		int escolha = 0;
		
		do {
			
			apresentarMenuPrincipal(Conta.getNome());

			InputCtrl.getUserInput("integer");

			if (InputCtrl.getStatus() == 0) {
				escolha = InputCtrl.getInteger();

			} else {
				System.out.println("ERRO TelaHome getUserInput: " + InputCtrl.getStatus());
			}

			System.out.println("");

			HomeCtrl.apresentar(escolha);
		} while ( (escolha > 0 && escolha < 4) );
	}


	private static void apresentarMenuPrincipal(String nomeCliente) {

		System.out.println("Bem vindo(a), " + nomeCliente + "\n");
		System.out.println("Menu principal \n");
		System.out.println("     1- Ver saldo");
		System.out.println("     2- Sacar dinheiro");
		System.out.println("     3- Depositar dinheiro");
		System.out.println("     4- Sair \n");
		System.out.print("Enter a choice: ");
	}
}
