
public class Main {

	public static void main(String[] args) {
		
		char letter='a',letterUpper;
		letterUpper= Character.toUpperCase(letter);
		
		switch(letterUpper) {
		
		case 'A':
		case 'E':
		case 'U':
		case 'I':
		case 'O':
			System.out.println("This letter is a vowel");
			break;
		default:
			System.out.println("This letter is a consonant");
			
		}

	}

}
