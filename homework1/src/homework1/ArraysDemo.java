package homework1;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Mustafa";
		String ogrenci2 = "Onur";
		String ogrenci3 = "Serdar";
		String ogrenci4 = "Ayberk";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------");
		
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Mustafa";
		ogrenciler[1] = "Onur";
		ogrenciler[2] = "Serdar";
		ogrenciler[3] = "Ayberk";
		ogrenciler[4] = "Muhammed";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
