package is.lell.prjatm.controle;

import java.util.Scanner;

public class InputCtrl {

	private static int status = -1;
	private static int returnInteger = 0;
	private static double returnDouble = 0.00;
	private static String returnString = "";
	private static char returnChar;

	public static void getUserInput (String inputType) {
		
		/**
		 * Classe que chama o scanner e trata os erros de input, etc. Disponibiliza via GET o input do usuário
		 * @param "integer", "double", "String" <string> 
		 */

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		switch (inputType) {

		case "integer":
			try {
				returnInteger = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
//				e.printStackTrace();
				System.out.println("InputCtrl error: number.Format.Exception.stringToInteger");
//				status = -2;
			} finally {
				System.out.println("entrou no finally");
			}
			if (status != -2) {
				status = 0;
			}
			break;

		case "double":

			returnString = scanner.nextLine();
			returnString = returnString.replace(',', '.');

			try {
				returnDouble = Double.parseDouble(returnString);
			} catch (NumberFormatException e) {
//				e.printStackTrace();
				System.out.println("InputCtrl error: number.Format.Exception.stringToDouble");
				status = -2;
			}
			if (status != -2) {
				status = 0;
			}
			break;

		case "string":
			returnString = scanner.nextLine();
			status = 0;
			break;
			
			
		case "char":
			try {
				returnChar = Character.toLowerCase(scanner.next().charAt(0));
				returnString = scanner.nextLine();
			} catch (NumberFormatException e) {
//				e.printStackTrace();
				System.out.println("InputCtrl error: number.Format.Exception.stringToChar");
				status = -2;
			}
			if (status != -2) {
				status = 0;
			}
			break;
			
		default:
			// passou parâmetro errado pro método, deu ruim geral
			status = -3;
			break;
		}
	}

	public static int getStatus() {
		return status;
	}

	public static int getInteger() {
		return returnInteger;
	}

	public static double getDouble() {
		return returnDouble;
	}

	public static String getString() {
		return returnString;
	}
	
	public static char getChar() {
		return returnChar;
	}
	
	/*                == Superseeded by getUserInput ==
	 *  
	 * private static double toDouble (String input) {
	 * 
	 * String resultado = input.replace(',', '.'); double numeroCorreto =
	 * Double.parseDouble(resultado); return numeroCorreto; }
	 */
}
