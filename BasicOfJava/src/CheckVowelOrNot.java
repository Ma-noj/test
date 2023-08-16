
public class CheckVowelOrNot {

	public static void main(String[] args) {
		char character = 'o';
		// One way
		/*
		 * if (character == 'a' || character == 'A') { System.out.println(character +
		 * " is a vowel"); } else if (character == 'e' || character == 'E') {
		 * System.out.println(character + " is a vowel"); } else if (character == 'i' ||
		 * character == 'I') { System.out.println(character + " is a vowel"); } else if
		 * (character == 'o' || character == 'O') { System.out.println(character +
		 * " is a vowel"); } else if (character == 'u' || character == 'U') {
		 * System.out.println(character + " is a vowel"); }
		 */

		// second way

//		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
//				|| character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
//			System.out.println(character + " is a vowel");
//		}

		switch (character) {
		case 'a':
			System.out.println(character + " is a vowel");
			break;
		case 'A':
			System.out.println(character + " is a vowel");
			break;
		case 'e':
			System.out.println(character + " is a vowel");
			break;
		case 'E':
			System.out.println(character + " is a vowel");
			break;
		case 'i':
			System.out.println(character + " is a vowel");
			break;
		case 'I':
			System.out.println(character + " is a vowel");
			break;
		case 'o':
			System.out.println(character + " is a vowel");
			break;
		case 'O':
			System.out.println(character + " is a vowel");
			break;
		case 'U':
			System.out.println(character + " is a vowel");
			break;
		case 'u':
			System.out.println(character + " is a vowel");
			break;

		default:
			System.out.println(character + " is a Not vowel");
			break;
		}

	}

}
