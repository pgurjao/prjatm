package is.lell.prjatm.modelo;

import is.lell.prjatm.modelo.enums.statusEnum;

//import is.lell.prjatm.Dados;

//import is.lell.prjatm.modelo.enums.statusEnum;

public class Conta {

	private String numeroConta;
	private int pin;
	private double saldo;
	private String nome;
	
	private String statusText;
	private int status;

	//	private List<Transacao> transacoes = new ArrayList<Transacao>;

	public Conta(String numero, int pin) {

		this.numeroConta = numero;
		this.pin = pin;
		this.saldo = 0;
		this.nome = "";
	}

	public Conta(String numero, int pin, double saldo, String nome) {

		this.numeroConta = numero;
		this.pin = pin;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public Conta() {
		//construtor vazio
	}

	public String getNumero() {
		return this.numeroConta;
	}

	public int getPin() {
		return this.pin;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getStatusText() {
		return this.statusText;
	}
	
	public int getStatus() {
		return this.status;
	}

	public boolean temSaldoSuficiente(double valor, double saldo) {
	
		if ( saldo >= Math.abs(valor) ) {
			return true;
		} else {
			return false;
		}
	}

	public int sacar(double valorSaque) {
	
		status = 0;
	
		if(temSaldoSuficiente(Math.abs(valorSaque), this.saldo) ) {
			
			this.saldo -= Math.abs(valorSaque);
			/*
			 * Conta contaNovoSaldo = new Conta(conta.getNumero(), conta.getPin(),
			 * conta.getSaldo() - valorSaque, conta.getNome());
			 * 
			 * conta = contaNovoSaldo; // será que funciona?????????????????
			 */			
			statusText = statusEnum.SAQUE_OK.toString();
			return status;
		} else {
			status = -1;			// Saldo Insuficiente
			statusText = statusEnum.SALDO_INSUFICIENTE.toString();
			return status;
		}
	}

	public int depositar(double valorDeposito) {
	
		
		this.saldo += Math.abs(valorDeposito);
		/*
		 * Conta contaNovoDeposito = new Conta(conta.getNumero(), conta.getPin(),
		 * conta.getSaldo() + valorDeposito, conta.getNome());
		 * 
		 * conta = contaNovoDeposito; // será que funciona?????????????????
		 */		
		statusText = statusEnum.DEPOSITO_OK.toString();
		status = 0; 
		return status;
	}

//	public static Conta setData(int indice) {
//
//		String esteNumero;
//		int estePin;
//		double esteSaldo;
//		String esteNome;
//
//		esteNumero = Dados.contas[indice];
//		estePin = Dados.senhas[indice];
//		esteSaldo = Dados.saldos[indice];
//		esteNome = Dados.nomes[indice];
//
//		Conta conta = new Conta(esteNumero, estePin, esteSaldo, esteNome);
//
//		return conta;		
//	}
}
