package is.lell.prjatm.controle;


import java.util.List;

import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.modelo.Transacao;


public class ExtratoCtrl {

	public List<Transacao> extrato(Conta conta) {
		return conta.getTransacoes();
	}

}
