package homework1;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'a';

		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case '�':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Kal�n sesli harf.");
			break;
		default:
			System.out.println("�nce sesli harf.");
		}
	}

}
