package homework1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel, ge�tiniz.");
			break;
		case 'B':
			System.out.println("�ok iyi, ge�tiniz.");
			break;
		case 'C':
		case 'D':
			System.out.println("Ge�tiniz.");
			break;
		case 'F':
			System.out.println("Kald�n�z.");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz.");

		}

	}

}
