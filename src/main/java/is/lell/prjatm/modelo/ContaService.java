package is.lell.prjatm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import is.lell.prjatm.Dados;
//import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.modelo.enums.statusEnum;


public class ContaService {
	
	private static int indiceConta = -1;
	private static String statusText;
	
	public static String getStatusText() {
		return statusText;
	}
	
	public static int getIndiceConta() {
		return indiceConta;
	}

	public static Conta login(String numeroConta, int pin) {

		boolean contaLocalizada = false;
		Conta conta = new Conta(numeroConta, pin);
		List<Conta> listConta = new ArrayList<Conta>();

		indiceConta = listConta.indexOf(conta.getNumero().equalsIgnoreCase(numeroConta));

//		int i = 0;
//		Conta conta = null;
		
		
//		List<Conta> collect = ModeloDatabase.contasList.stream()
//				.filter( c -> c.getNumero().equals(numeroConta) )
//				.collect(Collectors.toList());
		
		//listConta = ModeloDatabase.contasList.stream().filter(c -> c.getNumero().equalsIgnoreCase(numeroConta)).findFirst().collect(Collectors.toList());
		//listConta = ModeloDatabase.contasList.stream().filter(c -> c.getNumero().equalsIgnoreCase(numeroConta)).findFirst();
		//Integer indiceConta = ModeloDatabase.contasList.stream().filter(conta -> conta.getNumero.equalsIgnoreCase(numeroConta)).findFirst().orElse(null);
		
		
		// Procura sequencialmente no ARRAY o numeroConta até o final
		// e interrompe a busca antes se localizar

//		for (i = 0; i < Dados.contas.length ; i++) {
//			if (Dados.contas[i].equalsIgnoreCase(numeroConta) ) {
//				contaLocalizada = true;
//				statusText = statusEnum.CONTA_LOCALIZADA.toString();
//				indiceConta = i;
//				i = Dados.contas.length;	// break
//			}
//		}

		if (contaLocalizada) {
			if (conta.getPin() == pin ) {
				statusText = statusEnum.PIN_CORRETO_LOGIN_OK.toString();
				return conta;
			} else {
				statusText = statusEnum.PIN_INCORRETO.toString();
				return null;
			}
		} else {
			statusText = statusEnum.CONTA_NAO_LOCALIZADA.toString();
			return null;
		}
	}
	
}
