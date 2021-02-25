package is.lell.prjatm.controle;

import is.lell.prjatm.visao.TelaDeposito;
import is.lell.prjatm.visao.TelaSair;
import is.lell.prjatm.visao.TelaSaldo;
import is.lell.prjatm.visao.TelaSaque;

public class HomeCtrl {
	
	public static void apresentar (int choice) {
		
		switch (choice) {
		case 1:
			TelaSaldo.apresentar();
			break;

		case 2:
			TelaSaque.apresentar();
			break;
			
		case 3:
			TelaDeposito.apresentar();
			//			System.out.println("Depositar dinheiro");
			break;
			
		case 4:
			TelaSair.apresentar();
			break;			

		default:
			System.out.println("\n \n tela DEFAULT - você não deveria estar aqui \n \n");
			break;
		}
	}
}
