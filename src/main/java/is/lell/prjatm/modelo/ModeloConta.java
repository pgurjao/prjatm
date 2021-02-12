package is.lell.prjatm.modelo;

import is.lell.prjatm.Dados;

public class ModeloConta {

	private static int indiceConta = -1;

	private static String statusText;

	public static boolean login(String numeroConta,int pin) {

		boolean contaLocalizada = false;
		boolean fimDoArray = false;
		boolean breakLoop = false;
		//		boolean pinCorreto = false;

		int i = 0;

		do {
			if (i < Dados.contas.length ) {
				if (Dados.contas[i].equalsIgnoreCase(numeroConta)) {
					statusText = "Conta localizada";
					indiceConta = i;
					contaLocalizada = true;
				}
				i++;
			} else {
				if (i == Dados.contas.length && contaLocalizada == false) {
					statusText = "conta NÃO localizada";
					fimDoArray = true;
					return false;
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
				statusText = "PIN correto";
				//			pinCorreto = true;
				return true;
			} else {
				statusText = "PIN INCORRETO";
				return false;
			}
		} else {
			statusText = "Conta NÃO localizada";
			return false;
		}
	}

	public static int getIndiceConta() {
		return indiceConta;
	}

	public static String getClientName() {		

		return Dados.nome[indiceConta];
	}

	public static double getSaldo() {

		double saldo = Dados.saldos[indiceConta];		

		return saldo;
	}

	public static int setSaldo(double valor) {

		int exitCode = 0;

		if(getSaldo() - valor < 0) {
			exitCode = -1;           // saldo insuficiente
			return exitCode;
		} else {
			return exitCode;
		}
	}

	public static boolean temSaldoSuficiente(double valor) {

		if (getSaldo() >= valor ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String getStatusText() {
		return statusText;
	}
}