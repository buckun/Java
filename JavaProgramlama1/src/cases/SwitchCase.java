package cases;

import java.util.Scanner;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String gun = scanner.next();
		
		switch (gun) {
		case "PTS":
			System.out.println("PAZARTES�");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "�R�":
			System.out.println("�AR�AMBA");
			break;
		case "PR�":
			System.out.println("PER�EMBE");
			break;
		default:
			System.out.println("HAFTANIN B�R G�N� ��TE");
			break;
		}
		
		if (gun.equals("PTS")) {
			System.out.println("PAZARTES�");
		} else if (gun.equals("SL")) {
			System.out.println("SALI");
		} else if (gun.equals("�R�")) {
			System.out.println("�AR�AMBA");
		} else if (gun.equals("PR�")) {
			System.out.println("PER�EMBE");
		} else {
			System.out.println("HAFTANIN B�R G�N� ��TE");
		}
	}

}
