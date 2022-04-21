
public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		// Program to check if the number can be expressed as SUM of two Prime Numbers
		// 34 = 31+3 , 5+29, 11+23 17+17
		//System.out.println(checkPrimeNumber(17));
		
		int num = 34;
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++) {
			if(checkPrimeNumber(i)) {
				if(checkPrimeNumber(num-i)) {
					System.out.println(num + " = " + i + " + " +(num-i));
					flag =true;
				}
			}
		}
		
		if(!flag) {
			 System.out.println(num +" cannot be expressed as sum of two prime numbers ");
		}

	}
	
	
	static boolean checkPrimeNumber(int num) {
		
		boolean isPrime = true;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
				
			}
		}
		
		return isPrime;
	}

}
