
public class PrimeNumber {

	public static void main(String[] args) {
		
		// prime number : divisible by 1 and itself : 2, 3, 5,7,11,13,17
		
		int num=11;
		boolean flag = false;
		
		for(int i=2; i<num/2; i++) {
			
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println(num +" is a prime number");
		} else {
			System.out.println(num +" is not a prime number");
		}
			

	}

}
