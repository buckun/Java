package cases;

import java.util.Scanner;

public class NotPuaniHesapla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ald���n�z not = ");
		byte not = scanner.nextByte();
		
		if (not > 0 && not <21) {
			System.out.println("Ald��� harf notu = FF");
		} else if (not >= 20 && not <41) {
			System.out.println("Ald��� harf notu = DC");
		} else if (not > 40 && not <61) {
			System.out.println("Ald��� harf notu = CC");
		}  else if (not > 60 && not <81) {
			System.out.println("Ald��� harf notu = BB");
		} else {
			System.out.println("Ald��� harf notu = AA");
		}
		
		boolean ogrenciGecerNotAldi = not > 50;
		if (ogrenciGecerNotAldi) {
			System.out.println("Bu ��renci ge�er");
		}
		
		if (!ogrenciGecerNotAldi) {
			System.out.println("Bu ��renci kal�r");
		}
		
		if (1==3 || 2==2) {
			
		}
	}

}
