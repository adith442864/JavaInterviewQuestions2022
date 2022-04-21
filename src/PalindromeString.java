
public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "abba";
		String rev = "";
		
		String act_str = str;
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("Reversed String is :" +rev);
		
		if(act_str.equals(rev)) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String is not a Palindrome");
		}

	}

}
