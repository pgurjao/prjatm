package is.lell.prjatm.visao;

import java.util.Scanner;

import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.controle.SaqueCtrl;

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
									+ " realizado com sucesso");
				
			} else {
				System.out.println("Erro SaqueCtrl: "
									+ SaqueCtrl.getStatusText() );
			}
		} else {
			System.out.println("Erro ModeloInput: "
								+ InputCtrl.getStatus() );
			
		}

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * double valorSaque = ModeloInput.toDouble( sc.next() );
		 */

		//		System.out.println("valorSaque: " + valorSaque);
		//		sc.close();
	}
}