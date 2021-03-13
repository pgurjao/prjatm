package is.lell.prjatm.visao;

import java.text.SimpleDateFormat;
import java.util.Date;

//import java.util.Scanner;

import is.lell.prjatm.controle.HomeCtrl;
import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.modelo.Conta;

public class TelaHome {

	public static void apresentar(Conta conta) {

		int escolha = 0;
		
		do {
			apresentarMenuPrincipal(conta.getNome());

			InputCtrl.getUserInput("integer");

			if (InputCtrl.getStatus() == 0) {
				escolha = InputCtrl.getInteger();

			} else {
				System.out.println("ERRO TelaHome getUserInput: " + InputCtrl.getStatus());
				System.out.println(InputCtrl.getStatusText() );
			}

			System.out.println("");

			HomeCtrl.apresentar(escolha, conta);
		} while (escolha > 0 && escolha < 5);
	}


	private static void apresentarMenuPrincipal(String nomeCliente) {

		Date data = new Date(System.currentTimeMillis() );
		SimpleDateFormat spf = new SimpleDateFormat("EEE dd/MM/yyyy kk:mm:ss");
		
		System.out.println("Bem vindo(a), " + nomeCliente + "\n");
		System.out.print("Hoje é: " + spf.format(data) + "\n");
		System.out.println("Menu principal \n");
		System.out.println("     1- Ver saldo");
		System.out.println("     2- Sacar dinheiro");
		System.out.println("     3- Depositar dinheiro");
		System.out.println("     4- Ver extrato");
		System.out.println("     5- Sair \n");
		System.out.print("Enter a choice: ");
	}
}
