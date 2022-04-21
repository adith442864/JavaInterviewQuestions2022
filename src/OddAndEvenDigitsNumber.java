
public class OddAndEvenDigitsNumber {

	public static void main(String[] args) {
		
		int even_count=0;
		int odd_count=0;
		
		int num=12345;
		
		while(num>0) { //123456 12345 1234 123 12 1
			int rem = num%10; //4 //3
			
			if(rem%2==0) {
				even_count++; //1 2 3
			}else {
				odd_count++; //1 2 3 
			}
			
			num= num/10; //12345 1234 123 12 12 1 
			
		}
		
		System.out.println("Even Count is :" +even_count++);
		System.out.println("Odd Count is :" +odd_count++);
	}

}
