package cases;

import java.util.Scanner;

public class SwitchCaseBasariDurumu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ald���n�z harf notu\t:\t");
		String notDurumu = scanner.next();
		
		switch (notDurumu) {
		case "A":
			System.out.println("M�KEMMEL");
			break;
		case "B":
		case "C":
			System.out.println("�Y�");
			break;
		case "D":
			System.out.println("FENA DE��L");
			break;
		case "E":
			System.out.println("K�T�");
			break;
		case "F":
			System.out.println("�OK K�T�");
			break;
		default:
			break;
		}
	}
}
