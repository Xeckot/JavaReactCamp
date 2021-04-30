package homework1;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'a';

		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case 'ý':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Kalýn sesli harf.");
			break;
		default:
			System.out.println("Ýnce sesli harf.");
		}
	}

}
