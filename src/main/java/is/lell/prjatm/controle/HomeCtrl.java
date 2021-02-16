package is.lell.prjatm.controle;

import is.lell.prjatm.visao.TelaSair;
import is.lell.prjatm.visao.TelaSaldo;
import is.lell.prjatm.visao.TelaSaque;

public class HomeCtrl {
	
	public static void apresentar (int choice) {
		
		switch (choice) {
		case 1:
			TelaSaldo.apresentar();
//			System.out.println("Tela Ver Saldo");
			break;

		case 2:
			TelaSaque.apresentar();
//			System.out.println("Tela Sacar Dinheiro");
			break;
			
		case 3:
			System.out.println("Depositar dinheiro");
			break;
			
		case 4:
			TelaSair.apresentar();
			break;			

		default:
			System.out.println("tela DEFAULT");
			break;
		}
	}
}
