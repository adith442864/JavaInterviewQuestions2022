
public class ReverseNumber {

	public static void main(String[] args) {
		
		// 1234 -> 4321
		// 123 -> 321
		
		int num = 1234;
		int rev =0; 
		/*
		while(num!=0) {
			int n=num%10;   //1234%10 -> 4 is remainder
			rev = rev*10+n; //0*10+4 =4
			num = num/10;   //123
		}
		*/
		
		//2. Using StringBuffer Class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println("reversed number is : " +sb.reverse());
		
		
		
		
		
		
		
		
	}

}
