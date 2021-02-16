package is.lell.prjatm.controle;

import java.util.Scanner;

public class InputCtrl {

	private static int status = -1;
	private static int returnInteger = 0;
	private static double returnDouble = 0.00;
	private static String returnString = "";

	public static void getUserInput (String inputType) {

		Scanner scanner = new Scanner(System.in);

		switch (inputType) {

		case "integer":
			try {
				returnInteger = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			status = 0;
			break;

		case "double":

			returnString = scanner.nextLine();
			returnString = returnString.replace(',', '.');

			try {
				returnDouble = Double.parseDouble(returnString);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			status = 0;
			break;

		case "string":
			returnString = scanner.nextLine();
			status = 0;
			break;
			
		default:
			// passou parâmetro errado pro método, deu ruim geral
			status = -2;
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
	
	/*                == Superseeded by getUserInput ==
	 *  
	 * private static double toDouble (String input) {
	 * 
	 * String resultado = input.replace(',', '.'); double numeroCorreto =
	 * Double.parseDouble(resultado); return numeroCorreto; }
	 */
}
