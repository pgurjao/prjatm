package is.lell.prjatm.visao;

import java.util.ArrayList;
import java.util.List;

import is.lell.prjatm.controle.ExtratoCtrl;
import is.lell.prjatm.modelo.Conta;
import is.lell.prjatm.modelo.Transacao;

public class TelaExtrato {

	public static void apresentar(Conta conta) {
		
		apresentarTelaExtrato(conta);
		ExtratoCtrl extratoCtrl = new ExtratoCtrl();
		
		List<Transacao> transacoes = new ArrayList<Transacao>();
		transacoes = extratoCtrl.extrato(conta);
		
		if(!transacoes.isEmpty() ) {
			for(Transacao transacao : transacoes) {
				System.out.println(transacao.toString());
			}
			System.out.println("Fim do extrato\n"
					+ "-----------------------------\n");
		} else {
			System.out.println("   Ainda não foram registradas transações nesta conta\n" 
					+ "-----------------------------------------------------------------\n");
		}
		
	}

	private static void apresentarTelaExtrato(Conta conta) {
		
		System.out.println("=============================");
		System.out.println("    Extrato da conta: "
							+ conta.getNumero()
							+ "\n\n"
							+ "DATA       HORA        CONTA    VALOR      TIPO");
		
	}
}
