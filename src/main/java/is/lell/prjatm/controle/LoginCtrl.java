package is.lell.prjatm.controle;

import is.lell.prjatm.Dados;
import is.lell.prjatm.telas.TelaHome;

public class LoginCtrl {
	
	private static int indiceConta = -1;

	public static void login(String numeroConta, int pin) {

		boolean contaLocalizada = false;
		boolean buscaEncerrada = false;
//		boolean pinCorreto = false;
		
		int i = 0;

		do {
			if (i < Dados.contas.length ) {
				if (Dados.contas[i].equalsIgnoreCase(numeroConta)) {
					System.out.println("\n" + "Conta localizada \n");
					System.out.println("i= " + i);	
					indiceConta = i;
					contaLocalizada = true;
				}
				i++;
			} else {
				if (i == Dados.contas.length && contaLocalizada == false) {
					System.out.println("\n" + "Busca encerrada, conta NÃO localizada \n");
					buscaEncerrada = true;	
				}
			}
			/*
			 * System.out.println("Indice i == " + i);
			 * System.out.println("contaLocalizada == " + contaLocalizada); i++;
			 */
		}
		while ((contaLocalizada == false) || (buscaEncerrada == false));

		if (Dados.senhas[indiceConta] == pin ) {
			System.out.print("\n" + "PIN correto");
//			pinCorreto = true;
			TelaHome.apresentar();
		} else {
			System.out.print("\n" + "PIN INCORRETO");
		}

		/*
		 * if (contaLocalizada == true) { System.out.print("\n" + "Digite seu PIN: ");
		 * pin = sc.nextLine(); } if (!Dados.senhas[indiceConta].equalsIgnoreCase(pin))
		 * { System.out.print("\n" + "PIN CORRETO"); pinCorreto = true; }
		 */
	}

	public static int getIndiceConta() {
		return indiceConta;
	}
}
