package is.lell.prjatm.modelo;

import java.util.ArrayList;



import java.util.List;

import is.lell.prjatm.Dados;

public class ModeloDatabase {
	
	public static List<Conta> contasList = new ArrayList<Conta>();
//	private static List<Integer> senhasList = new ArrayList<Integer>();
	
	
	public static void inicializar() {
		
		
		for (int i = 0; i > Dados.contas.length ; i++) {

//			Conta conta = new Conta(Conta.setData(i));

			Conta conta = new Conta(Dados.contas[i],
									Dados.senhas[i],
									Dados.saldos[i],
									Dados.nomes[i]);

			contasList.add(conta);
		}
			
		
	}

}
