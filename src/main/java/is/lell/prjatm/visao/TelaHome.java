package is.lell.prjatm.visao;

//import java.util.Scanner;

import is.lell.prjatm.controle.HomeCtrl;
import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.modelo.ModeloConta;

public class TelaHome {

	public static void apresentar() {

		int escolha = -1;
		boolean primeiraExecucao = true;
		char novaOperacao = 's';

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("primeira exec: " + primeiraExecucao);
		 * System.out.println("novaOperacao: " + novaOperacao);
		 * System.out.println("escolha: " + escolha);
		 */

		while ((escolha > 0 && escolha < 4) || novaOperacao == 's') {

			if (!primeiraExecucao && escolha != 4) {
				System.out.print("\nDeseja realizar mais alguma operação (S/N) ? ");
				InputCtrl.getUserInput("char");

				if (InputCtrl.getStatus() == 0) {
					novaOperacao = InputCtrl.getChar();
				}
//				novaOperacao = Character.toLowerCase(sc.next().charAt(0));
			}
			if (novaOperacao == 's') {

				apresentarMenuPrincipal(ModeloConta.getClientName());

				InputCtrl.getUserInput("integer");

				if (InputCtrl.getStatus() == 0) {
					escolha = InputCtrl.getInteger();

//				escolha = Integer.parseInt( sc.next() );

					System.out.println("");

					primeiraExecucao = false;

					HomeCtrl.apresentar(escolha);

					escolha = -1;
				} else {
					System.out.println("ERRO TelaHome getUserInput: " + InputCtrl.getStatus());
				}

			} else {
				escolha = 4;
				novaOperacao = 'n';
				HomeCtrl.apresentar(escolha);
			}
		}
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
