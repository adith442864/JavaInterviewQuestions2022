
public class PowerConcept {

	public static void main(String[] args) {
	
		// 3^4 = 81
		
		int base =2;
		int exponent =4;
		
		long result =1;
		
		while(exponent!=0) {
			result = result*base; //1*2 =2, 2*2=4, 4*2=8, 8*2=16
			exponent--; //4 3 2 1
		}
		
		System.out.println(result);

	}

}
