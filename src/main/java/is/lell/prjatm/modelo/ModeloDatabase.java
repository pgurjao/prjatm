package is.lell.prjatm.modelo;

import java.util.ArrayList;



import java.util.List;

import is.lell.prjatm.Dados;

public class ModeloDatabase {
	
	public static List<Conta> REPOSITORIO = new ArrayList<Conta>();
//	private static List<Integer> senhasList = new ArrayList<Integer>();
	
	
	public static void inicializar() {
		
//		System.out.println("dentro database inicializar");
//		System.out.println("Dados.contas.lenght: " + Dados.contas.length);
		for (int i = 0; i < Dados.contas.length ; i++) {
			
//			System.out.println("dentro FOR database init");

//			Conta conta = new Conta(Conta.setData(i));

			Conta conta = new Conta(Dados.contas[i],
									Dados.senhas[i],
									Dados.saldos[i],
									Dados.nomes[i]);
			System.out.println("-- Adicionando conta ao REPOSITORIO -- \n" + conta.toString());
			REPOSITORIO.add(conta);
		}
	}
}
