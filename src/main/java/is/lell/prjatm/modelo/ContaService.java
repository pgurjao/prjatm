package is.lell.prjatm.modelo;

import is.lell.prjatm.Dados;
import is.lell.prjatm.modelo.enums.statusEnum;
import java.util.List;
import java.util.stream.Collectors;


public class ContaService {
	
	private static int indiceConta = -1;
	private static String statusText;
	
	public static String getStatusText() {
		return statusText;
	}
	
	public static int getIndiceConta() {
		return indiceConta;
	}

	public Conta login(String numeroConta, int pin) {

		boolean contaLocalizada = false;
		int i = 0;
		Conta conta = new Conta(numeroConta, pin);
		
//		Conta conta = null;
		
//		List<Conta> collect = ModeloDatabase.contasList.stream()
//				.filter( c -> c.getNumero().equals(numeroConta) )
//				.collect(Collectors.toList());
		
		
		
		List<Conta> lConta = ModeloDatabase.contasList.stream().filter(c -> c.getNumero().equalsIgnoreCase(numeroConta)).findFirst().collect(Collectors.toList());

//		Integer indiceConta = ModeloDatabase.contasList.stream().filter(conta -> conta.getNumero.equalsIgnoreCase(numeroConta)).findFirst().orElse(null);
		
		
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
			if (Dados.senhas[indiceConta] == pin ) {
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
	
	public static int sacar(double valorSaque, Conta conta) {

		int status = 0;
		valorSaque = Math.abs(valorSaque);

		if(temSaldoSuficiente(valorSaque, conta) ) {
			Dados.saldos[indiceConta] -= valorSaque;
			statusText = statusEnum.SAQUE_OK.toString();
			return status;
		} else {
			status = -1;			// Saldo Insuficiente
			statusText = statusEnum.SALDO_INSUFICIENTE.toString();
			return status;
		}
	}

	public static boolean temSaldoSuficiente(double valor, Conta conta) {

		valor = Math.abs(valor);
		
		if ( conta.getSaldo() >= valor ) {
			return true;
		} else {
			return false;
		}
	}

	public static int depositar(double valorDeposito) {

		valorDeposito = Math.abs(valorDeposito);
		Dados.saldos[indiceConta] += valorDeposito;
		statusText = statusEnum.DEPOSITO_OK.toString();
		return 0;
	}
	
}
