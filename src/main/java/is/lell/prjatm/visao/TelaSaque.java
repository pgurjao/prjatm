package is.lell.prjatm.visao;

import java.util.Scanner;

import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.controle.SaqueCtrl;
import is.lell.prjatm.modelo.ModeloConta;

public class TelaSaque {

	public static void apresentar() {

		double valorSaque;

		System.out.println("========================="
							+ "\n"
							+ "Tela do Saque"
							+ "\n");							
		System.out.print("Digite o valor que deseja sacar: ");

		InputCtrl.getUserInput("double");

		if (InputCtrl.getStatus() == 0 ) {

			valorSaque = InputCtrl.getDouble();
			SaqueCtrl.saque(valorSaque);

			if (SaqueCtrl.getStatus() == 0) {
				System.out.println("Saque de "
									+ valorSaque
									+ " realizado com sucesso. \n");
				System.out.println("Seu saldo atualizado é: "
									+ ModeloConta.getSaldo() );

			} else {
				System.out.println("ERRO SaqueCtrl: "
									+ SaqueCtrl.getStatusText() );
			}
		} else {
			System.out.println("ERRO ModeloInput: "
								+ InputCtrl.getStatus() );
		}
	}
}