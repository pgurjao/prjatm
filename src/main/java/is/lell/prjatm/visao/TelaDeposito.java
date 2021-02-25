package is.lell.prjatm.visao;

import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.controle.DepositoCtrl;

public class TelaDeposito {

	public static void apresentar () {

		apresentarTelaDeposito();

		InputCtrl.getUserInput("double");

		if (InputCtrl.getStatus() == 0 ) {

			double valorDeposito = (InputCtrl.getDouble() );
			DepositoCtrl.depositar(valorDeposito);

			if (DepositoCtrl.getStatus() == 0) {
				System.out.printf("Depósito de %.2f realizado com sucesso %n"
									, Math.abs(valorDeposito));

				System.out.println("=========================\n");

			} else {
				System.out.println("ERRO DepositoCtrl: "
						+ DepositoCtrl.getStatusText() );
				System.out.println("");
			}
		} else {
			System.out.println("ERRO ModeloInput: "
					+ InputCtrl.getStatus() );
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
