package is.lell.prjatm.modelo;

public class Enums {
	
	public static enum statusEnum {
		CONTA_LOCALIZADA,
		CONTA_NAO_LOCALIZADA,
		PIN_CORRETO_LOGIN_OK,
		PIN_INCORRETO,
		SALDO_INSUFICIENTE,
		SAQUE_OK,
		DEPOSITO_OK
	}
	
	public static enum TipoTransacao {
		DEBITO,
		CREDITO,
	}

}
