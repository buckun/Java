package cases;

import java.util.Scanner;

public class NotHesaplama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Do�ru Cevap Say�s�");
		int dogruCevapSayisi = scanner.nextInt();
		
		System.out.print("Yanl�� Cevap Say�s�");
		int yanlisCevapSayisi = scanner.nextInt();
		
		dogruCevapSayisi = dogruCevapSayisi - (yanlisCevapSayisi / 4); 
		float dogruCevapPuani = dogruCevapSayisi * 5;
		System.out.println("Do�ru Puan� = " + dogruCevapPuani);

		float yanlisCevapPuani = yanlisCevapSayisi * 0.25f;
		System.out.println("Yanl�� Puan� = " + yanlisCevapPuani);
		
		float genelPuan = dogruCevapPuani - yanlisCevapPuani;
		System.out.println("Ald��� Puan = " + genelPuan);
		if (genelPuan > 50) {
			System.out.println("GE�T�");
		} else {
			System.out.println("KALDI");
		}
	}

}