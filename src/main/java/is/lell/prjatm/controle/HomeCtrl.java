package is.lell.prjatm.controle;

import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.visao.TelaDeposito;
import is.lell.prjatm.visao.TelaExtrato;
import is.lell.prjatm.visao.TelaSair;
import is.lell.prjatm.visao.TelaSaldo;
import is.lell.prjatm.visao.TelaSaque;

public class HomeCtrl {
	
	public static void apresentar (int choice, Conta conta) {
		
		switch (choice) {
		case 1:
			TelaSaldo.apresentar(conta);
			break;

		case 2:
			TelaSaque.apresentar(conta);
			break;
			
		case 3:
			TelaDeposito.apresentar(conta);
			//			System.out.println("Depositar dinheiro");
			break;
			
		case 4:
			TelaExtrato.apresentar(conta);
			break;
			
		case 5:
			TelaSair.apresentar();
			break;			

		default:
			System.out.println("\n \n tela DEFAULT (undefined) - você não deveria estar aqui \n \n");
			break;
		}
	}
}
