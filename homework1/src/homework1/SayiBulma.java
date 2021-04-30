package homework1;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 22;
		boolean varMý = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMý = true;
				break;
			}
		}

		if (varMý) {
			System.out.println("Sayý mevcuttur.");
		} else {
			System.out.println("Sayý mevcut deðildir.");
		}

	}

}
