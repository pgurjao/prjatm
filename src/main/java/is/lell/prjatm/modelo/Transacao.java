package is.lell.prjatm.modelo;

import is.lell.prjatm.modelo.Enums.TipoTransacao;

public class Transacao {

	private TipoTransacao tipoTransacao;
	
	private double valor;
	
	private Conta conta;
	
	public Transacao(TipoTransacao tipoTransacao, double valor, Conta conta) {
		this.tipoTransacao = tipoTransacao;
		this.valor = valor;
		this.conta = conta;
	}
	
	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public double getValor() {
		return valor;
	}

	public Conta getConta() {
		return conta;
	}

	@Override
	public String toString() {
		return "Transacao [tipoTransacao= " + tipoTransacao + ", valor=" + valor + ", conta=" + conta.getNumero() + "]";
	}
}
