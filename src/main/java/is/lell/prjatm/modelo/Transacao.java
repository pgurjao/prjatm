package is.lell.prjatm.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import is.lell.prjatm.modelo.Enums.TipoTransacao;

public class Transacao {

	private TipoTransacao tipoTransacao;
	
	private double valor;
	
	private Conta conta;
	
	private Date data;
	
	public Transacao(TipoTransacao tipoTransacao, double valor, Conta conta) {
		this.tipoTransacao = tipoTransacao;
		this.valor = valor;
		this.conta = conta;
		this.data = new Date(System.currentTimeMillis() );
	}
	
	public Transacao(TipoTransacao tipoTransacao, double valor, Conta conta, Date date) {
		this.tipoTransacao = tipoTransacao;
		this.valor = valor;
		this.conta = conta;
		this.data = date;
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

	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-3") );
//		Date data = sdf.parse(null);
//		return "Transacao [tipoTransacao= " + tipoTransacao + ", valor=" + valor + ", conta=" + conta.getNumero() + " Data=" + sdf.format(data) + "]";
//		return "sdf.format(data) + conta.getNumero() + valor + "  " + tipoTransacao + "]";
//		return "" + sdf.format(data) + "    " + conta.getNumero() + "    " + valor + "    " + tipoTransacao +"";

		String retorno = "";

		retorno = sdf.format(data) + "    "
				+ conta.getNumero().toString() + "    "
				+ Double.toString(valor) + "    "
				+ tipoTransacao.toString();
		
//				, conta.getNumero().toString(), valor, tipoTransacao.toString() );
//		return "%s    %i    %.2f    %s" sdf.format(data).toString(), conta.getNumero(), valor, tipoTransacao);
		
		return retorno;
	}
}
