
public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		// 1234 - 4 digits
		// 123 - 3 digits
		
		int num = 123;
		int count=0;
		
		while(num!=0) {
			num=num/10; //123 12 1 and 0
			count++; //3
		}
		
		System.out.println("no of digits : " +count);
	}

}
