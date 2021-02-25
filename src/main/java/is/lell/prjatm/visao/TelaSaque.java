package is.lell.prjatm.visao;

import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.controle.SaqueCtrl;
import is.lell.prjatm.modelo.ModeloConta;

public class TelaSaque {

	public static void apresentar() {

		apresentarTelaSaque();

		InputCtrl.getUserInput("double");

		if (InputCtrl.getStatus() == 0 ) {

			double valorSaque = (InputCtrl.getDouble());
			SaqueCtrl.sacar(valorSaque);

			if (SaqueCtrl.getStatus() == 0) {
				System.out.printf("Saque de %.2f realizado com sucesso %n"
									, Math.abs(valorSaque));
				
				System.out.printf("Seu saldo atualizado é: %.2f %n"
									, ModeloConta.getSaldo() );
				
				System.out.println("=========================\n");

			} else {
				System.out.println("ERRO SaqueCtrl: "
									+ SaqueCtrl.getStatusText() );
				System.out.println("");
			}
		} else {
			System.out.println("ERRO ModeloInput: "
								+ InputCtrl.getStatus() );
			System.out.println("");
		}
	}
	
	private static void apresentarTelaSaque() {
		
		System.out.println("========================="
							+ "\n"
							+ "Tela do Saque"
							+ "\n");							
		System.out.print("Digite o valor que deseja sacar: ");
	}
	
}