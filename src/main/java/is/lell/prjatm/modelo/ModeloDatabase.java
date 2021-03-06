package is.lell.prjatm.modelo;

import java.util.ArrayList;



import java.util.List;

import is.lell.prjatm.Dados;

public class ModeloDatabase {
	
	public static List<Conta> REPOSITORIO = new ArrayList<Conta>();

	public static void inicializar() {
		
		for (int i = 0; i < Dados.contas.length ; i++) {

			Conta conta = new Conta(Dados.contas[i],
									Dados.senhas[i],
									Dados.saldos[i],
									Dados.nomes[i]);
			System.out.println("-- Adicionando conta ao REPOSITORIO -- \n" + conta.toString());
			REPOSITORIO.add(conta);
		}
	}
}
