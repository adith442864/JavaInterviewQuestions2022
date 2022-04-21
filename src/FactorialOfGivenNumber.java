
public class FactorialOfGivenNumber {
	
	// 5! = 1 * 2 * 3 * 4 * 5 = 120

	public static void main(String[] args) {
		
		int fact=1;
		int num=5;
		
		/* Positive 
		for(int i=1; i<=num; i++) {
			fact=fact*i; // 1 2 6 24 120 
		} */
		
		// Negative
		for(int i=num; i>=1; i--) { //5 20 60 120
			fact=fact*i;
		}
		
		System.out.println(fact); //120
		
		
	}

}
