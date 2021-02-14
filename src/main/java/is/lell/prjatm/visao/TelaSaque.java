package is.lell.prjatm.visao;

import java.util.Scanner;

public class TelaSaque {

	public static void apresentar() {

		System.out.println("=========================" + "\n" + 
				"Tela do Saque \n \n");
		System.out.print("Digite o valor que deseja sacar: ");
		
		Scanner sc = new Scanner(System.in);
		
		double valorSaque = sc.nextDouble();
		
		
		sc.close();
	}
}