package homework1;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 22;
		boolean varM� = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varM� = true;
				break;
			}
		}

		if (varM�) {
			System.out.println("Say� mevcuttur.");
		} else {
			System.out.println("Say� mevcut de�ildir.");
		}

	}

}
