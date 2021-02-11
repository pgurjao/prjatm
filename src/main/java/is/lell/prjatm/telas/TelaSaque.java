package is.lell.prjatm.telas;

import java.util.Scanner;

import is.lell.prjatm.Dados;
import is.lell.prjatm.controle.LoginCtrl;

public class TelaSaque {

	public static void apresentar() {

		System.out.println("=========================" + "\n" + 
				"Tela do Saque \n \n");
		System.out.print("Digite o valor que deseja sacar: ");
		
		Scanner sc = new Scanner(System.in);
		
		double valorSaque = sc.nextDouble();
		
		if (valorSaque > Dados.saldos[LoginCtrl.getIndiceConta()]) {
			System.out.println("Saldo insuficiente");
		} else {
			System.out.println("\n Operação aceita, pegue os " + valorSaque + " no local indicado");
			double saldoAtualizado = Dados.saldos[LoginCtrl.getIndiceConta()]-valorSaque;
			System.out.println("Seu saldo agora é: " + saldoAtualizado);
		}
		sc.close();
	}
}