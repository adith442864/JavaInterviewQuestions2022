
public class PalindromeNumber {

	public static void main(String[] args) {
		// Palindrome Number : 121, 1221
		
		int num=1212;
		
		int rev=0;
		
		int actualNumber=num;
		
		while(num!=0) {
			int n=num%10;
			rev=rev * 10 +n;
			num=num/10; //eliminate the last digit
		}
		
		System.out.println(rev);
		
		if(actualNumber==rev) {
			System.out.println(rev+ " is a palnindrome number");
		}
		else {
			System.out.println(rev+ " is not a palnindrome number");
		}

	}

}
