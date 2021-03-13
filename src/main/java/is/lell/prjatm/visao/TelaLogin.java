package is.lell.prjatm.visao;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import is.lell.prjatm.controle.InputCtrl;
import is.lell.prjatm.controle.LoginCtrl;
public class TelaLogin {
	
	public static void apresentar () {

		Locale.setDefault(Locale.US);
		String numeroConta;
		int pin = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
		Date data = new Date();
		
		System.out.println("Bem vindo\n");
		System.out.println("Agora são " + sdf.format(data) + "\n" );
		System.out.print("Por favor digite o número da conta: ");
		
		InputCtrl.getUserInput("string");
		numeroConta = InputCtrl.getString();
		
		System.out.print("Por favor digite o PIN: ");
		
		InputCtrl.getUserInput("integer");
		
		if (InputCtrl.getStatus() == 0 ) {
			pin = InputCtrl.getInteger();
		} else {
			System.out.println(InputCtrl.getStatusText() );
		}
		
		System.out.println("");
		
		LoginCtrl.login(numeroConta,pin);
		
		if (LoginCtrl.getStatus() != 0 ) {
			System.out.println("ERRO: " + LoginCtrl.getStatusText() );
		}
	}
}
