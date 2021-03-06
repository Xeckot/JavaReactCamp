package homework2;

public class Methods2 {

	public static void main(String[] args) {
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("GŁncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}

		return toplam;

	}

	public static String sehirVer() {
		return "Ankara";
	}
}
