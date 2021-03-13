package is.lell.prjatm.visao;

import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.controle.DepositoCtrl;
import is.lell.prjatm.modelo.Conta;

public class TelaDeposito {

	public static void apresentar (Conta conta) {

		apresentarTelaDeposito();

		InputCtrl.getUserInput("double");

		if (InputCtrl.getStatus() == 0 ) {

			double valorDeposito = Math.abs(InputCtrl.getDouble() );
			DepositoCtrl.depositar(valorDeposito, conta);

			if (DepositoCtrl.getStatus() == 0) {
				System.out.printf("Depósito de %.2f realizado com sucesso %n"
									, valorDeposito);

				System.out.println("=========================\n");

			} else {
				System.out.println("ERRO DepositoCtrl: "
						+ DepositoCtrl.getStatusText() );
				System.out.println("");
			}
		} else {
			System.out.println("ERRO ModeloInput: "
					+ InputCtrl.getStatus() );
			System.out.println(InputCtrl.getStatusText() );
			System.out.println("");
		}
	}

	private static void apresentarTelaDeposito() {

		System.out.println("========================="
				+ "\n"
				+ "Tela do Depósito"
				+ "\n");							
		System.out.print("Digite o valor que deseja depositar: ");
	}

}
