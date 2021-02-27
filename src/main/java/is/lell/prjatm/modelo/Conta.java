package is.lell.prjatm.modelo;

import is.lell.prjatm.Dados;

import is.lell.prjatm.modelo.enums.statusEnum;

public class Conta {

	private String numeroConta;
	private int pin;
	private double saldo;
	private String nome;

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
		this.saldo = 0;
		this.nome = "";
	}
	
	public Conta() {
		//construtor vazio
	}

	public String getNumero() {
		return this.numeroConta;
	}

	public int getPin() {
		return pin;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNome() {
		return this.nome;
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
