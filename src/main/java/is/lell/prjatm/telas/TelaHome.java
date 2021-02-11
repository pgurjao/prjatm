package is.lell.prjatm.telas;

import java.util.Scanner;

import is.lell.prjatm.controle.HomeCtrl;

public class TelaHome {
	
	public static void apresentar () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main menu \n");
		System.out.println("     1- View my balace");
		System.out.println("     2- Withdraw cash");
		System.out.println("     3- Deposit funds");
		System.out.println("     4- Exit");
		System.out.print("Enter a choice: ");
		
		int choice = sc.nextInt();
		sc.close();
		HomeCtrl.apresentar(choice);
	}

}
