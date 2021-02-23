package is.lell.prjatm.modelo;

import is.lell.prjatm.Dados;

public class ModeloConta {

	private static int indiceConta = -1;

	private static String statusText;

	public static boolean login(String numeroConta,int pin) {

		boolean contaLocalizada = false;
//		boolean fimDoArray = false;

		int i = 0;

		// Procura numero da conta no array sequencialmente
		// até que seja localizado ou até o fim do array.
//		
//		for (
//		
//		
//		do {
//			if (i < Dados.contas.length) {
//				if (Dados.contas[i].equalsIgnoreCase(numeroConta)) {
//					statusText = "Conta localizada";
//					indiceConta = i;
//					contaLocalizada = true;
//				}
//				i++;
//			} else {
//				//if ( /*i == Dados.contas.length && */ contaLocalizada == false) {
//					statusText = "conta NÃO localizada";
//					fimDoArray = true;
////					return false;
//				//}
//			}
//		} while (!(contaLocalizada || fimDoArray));

		while ( !(contaLocalizada || (i == Dados.contas.length ) ) ) {
			if (i < Dados.contas.length) {
				if (Dados.contas[i].equalsIgnoreCase(numeroConta) ) {
					statusText = "Conta localizada";
					indiceConta = i;
					contaLocalizada = true;
				}
			} else {
				statusText = "Conta NÃO localizada";
			}
			i++;
		}

		if (contaLocalizada) {
			if (Dados.senhas[indiceConta] == pin ) {
				statusText = "PIN correto, usuário logado com sucesso";
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
		return Dados.nomes[indiceConta];
	}

	public static double getSaldo() {
		return Dados.saldos[indiceConta];
	}

	public static int sacar(double valor) {

		int status = 0;

		if(temSaldoSuficiente(valor) ) {
			Dados.saldos[indiceConta] -= valor;
			return status;
		} else {
			status = -1;			// Saldo Insuficiente
			return status;
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