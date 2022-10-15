package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'g';
		switch (grade) {
		case 'A':
			System.out.println("mukemmel gectiniz");
			break;
		case 'B':
			System.out.println("cok guzel gectiniz");
			break;
		case 'c':
			System.out.println("fena degil gectiniz");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("gecersiz not girdiniz");
		}

	}

}
