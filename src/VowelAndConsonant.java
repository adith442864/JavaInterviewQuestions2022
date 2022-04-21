
public class VowelAndConsonant {

	public static void main(String[] args) {
	
		// a e i o u
		
		char ch = 'e';
		
		// 1.if statement:
		if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o'||ch=='u') {
			System.out.println(ch + " is Vowel ");
		}
		else {
			System.out.println(ch + " is Consonant");
		}
		
		//2. Switch Case Statement:
		switch (ch) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': 
			System.out.println(ch + " is vowel");
		break;
		default:
			System.out.println(ch + " is consonanat");
		}

	}

}
