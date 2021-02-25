package is.lell.prjatm.modelo;

import is.lell.prjatm.Dados;

import is.lell.prjatm.modelo.enums.statusEnum;

public class ModeloConta {

	private static int indiceConta = -1;

	private static String statusText;

	public static boolean login(String numeroConta, int pin) {

		boolean contaLocalizada = false;
		int i = 0;

		// Procura sequencialmente no ARRAY o numeroConta até o final
		// e interrompe a busca antes se localizar
		
		for (i = 0; i < Dados.contas.length ; i++) {
			if (Dados.contas[i].equalsIgnoreCase(numeroConta) ) {
				contaLocalizada = true;
				statusText = statusEnum.CONTA_LOCALIZADA.toString();
				indiceConta = i;
				i = Dados.contas.length;	// break
			}
		}
	
		if (contaLocalizada) {
			if (Dados.senhas[indiceConta] == pin ) {
				statusText = statusEnum.PIN_CORRETO_LOGIN_OK.toString();
				return true;
			} else {
				statusText = statusEnum.PIN_INCORRETO.toString();
				return false;
			}
		} else {
			statusText = statusEnum.CONTA_NAO_LOCALIZADA.toString();
			return false;
		}
		
//		boolean fimDoArray = false;
//
		// Procura número da conta no array sequencialmente
		// até que seja localizado ou até o fim do array.
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
//		
//		
		// Mesma coisa do LOOP "do" acima, mas utilizando "while"
//		
//		
//		while ( !(contaLocalizada || (i == Dados.contas.length ) ) ) {
//			if (i < Dados.contas.length) {
//				if (Dados.contas[i].equalsIgnoreCase(numeroConta) ) {
//					statusText = "Conta localizada";
//					indiceConta = i;
//					contaLocalizada = true;
//				}
//			} else {
//				statusText = "Conta NÃO localizada";
//			}
//			i++;
//		}

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
			statusText = statusEnum.SAQUE_OK.toString();
			return status;
		} else {
			status = -1;			// Saldo Insuficiente
			statusText = statusEnum.SALDO_INSUFICIENTE.toString();
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