package is.lell.prjatm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo" + "\n");
		System.out.println();
		System.out.print("Por favor entre com o seu número de conta: ");
		
		String numeroConta = sc.nextLine();
		
		boolean localizado = false;
		
		int i = 0;
		int tamanho = Dados.contas.length;
		
		
		do  {

			if (Dados.contas[i].equalsIgnoreCase(numeroConta)) {
				System.out.println("\n" + "Conta localizada");
				localizado = true;
			}
			System.out.println("i == " + i);
			System.out.println("localizado == " + localizado);
			i++;
			
			

			// for (int i = 0 ; i < Dados.contas.length ; i++ ) {
			// for (String i : Dados.contas) {			
			// System.out.println(Dados.contas[i]);
			// System.out.println(i);

		}
		//while ( localizado != true );
		while ( i != Dados.contas.length );
		
		if (localizado == false ) {
			System.out.println("Conta nao loacalizada \n");
		}

		System.out.print("\n" 
				+ "Digite seu PIN: ");

		int PIN = sc.nextInt();

		System.out.println();		

		System.out.println("Main menu");
		System.out.println("     1- View my balace");
		System.out.println("     2- Withdraw cash");
		System.out.println("     3- Deposit funds");
		System.out.println("     4- Exit");
		System.out.print("Enter a choice: ");

		int choice = sc.nextInt();

		if (choice < 4 ) {
			System.out.println("\n" + "Opcao digitada: "  + choice);
		}

		System.out.println("\n" + "F   i   m");
		sc.close();
	}

}
