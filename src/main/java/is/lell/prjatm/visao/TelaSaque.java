package is.lell.prjatm.visao;

import java.util.Scanner;

import is.lell.prjatm.controle.SaqueCtrl;
import is.lell.prjatm.modelo.ModeloInput;

public class TelaSaque {

	public static void apresentar() {

		double valorSaque;

		System.out.println("========================="
							+ "\n"
							+ "Tela do Saque"
							+ "\n");							
		System.out.print("Digite o valor que deseja sacar: ");

		ModeloInput.getUserInput("double");

		if (ModeloInput.getStatus() == 0 ) {
			
			valorSaque = ModeloInput.getDouble();
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
								+ ModeloInput.getStatus() );
			
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