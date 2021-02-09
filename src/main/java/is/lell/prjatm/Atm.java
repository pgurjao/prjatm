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
		int indiceConta = 0;
		
		
		do  {

			if (Dados.contas[i].equalsIgnoreCase(numeroConta)) {
				System.out.println("\n" + "Conta localizada \n");
				indiceConta = i;
				localizado = true;
				
			}
			System.out.println("Passagem nº == " + i);
			System.out.println("localizado == " + localizado);
			i++;			

			// for (int i = 0 ; i < Dados.contas.length ; i++ ) {
			// for (String i : Dados.contas) {			
			// System.out.println(Dados.contas[i]);
			// System.out.println(i);

		} while ( localizado != true || i != Dados.contas.length );
		//while ( localizado != true );
		//while ( i != Dados.contas.length );
		
		if (localizado == false ) {
			System.out.println("Conta nao loacalizada \n\n");
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

		switch (choice) {
		case 1:
			System.out.println("Verificando saldo..." + "\n");
			System.out.println("Seu saldo é: " + Dados.saldos[indiceConta]);			
			break;
		
		case 2:
			System.out.println("Realizando saque..." + "\n");
			System.out.println("Digite o valor a ser sacado: ");
			double saque = sc.nextDouble();
			
			if(saque > Dados.saldos[indiceConta]) {
				System.out.println("Saldo insuficiente \n");
			} else {
				Dados.saldos[indiceConta] = Dados.saldos[indiceConta] - saque; 
			}
			break;			
		
		case 3:
			System.out.println("Depositando dinheiro..." + "\n");
			System.out.println("Digite o valor a ser depositado: ");
			double deposito = sc.nextDouble();
			
			if(deposito <= 0.00 ) {
				System.out.println("O valor de deposito não pode ser menor ou igual a zero");
			} else {			
				Dados.saldos[indiceConta] = Dados.saldos[indiceConta] + deposito;
			}
			break;
		
		case 4:
			System.out.println("Saindo...");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		
		System.out.println("\n" + "F   i   m");
		sc.close();
	}

}
