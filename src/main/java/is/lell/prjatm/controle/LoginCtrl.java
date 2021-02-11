package is.lell.prjatm.controle;

import is.lell.prjatm.Dados;
import is.lell.prjatm.telas.TelaHome;

public class LoginCtrl {
	
	private static int indiceConta = -1;

	public static void login(String numeroConta, int pin) {

		boolean contaLocalizada = false;
		boolean fimDoArray = false;
		boolean breakLoop = false;
//		boolean pinCorreto = false;
		
		int i = 0;

		do {
			if (i < Dados.contas.length ) {
				if (Dados.contas[i].equalsIgnoreCase(numeroConta)) {
					System.out.println("\n === Conta localizada === \n");
					indiceConta = i;
					contaLocalizada = true;
				}
				i++;
			} else {
				if (i == Dados.contas.length && contaLocalizada == false) {
					System.out.println("\n Busca encerrada, conta NÃO localizada \n");
					fimDoArray = true;
				}
			}
			if (contaLocalizada || fimDoArray) {
				breakLoop=true;
			}
//			System.out.println("i= " + i);
//			System.out.println("contaLocalizada= " + contaLocalizada);
//			System.out.println("Fim do Array= " + fimDoArray);
//			System.out.println("breakLoop= " + breakLoop);
		}
		while (!breakLoop);
//		while (!contaLocalizada || !buscaEncerrada );

		if (contaLocalizada) {
			if (Dados.senhas[indiceConta] == pin ) {
				System.out.println("\n PIN correto \n");
				//			pinCorreto = true;
				TelaHome.apresentar();
			} else {
				System.out.println("\n PIN INCORRETO");
			}
		}
	}

	public static int getIndiceConta() {
		return indiceConta;
	}
}
