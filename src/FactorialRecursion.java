
public class FactorialRecursion {

	public static void main(String[] args) {
		
		int num=5;
		
		int fact = factNum(num);
		System.out.println(fact);

	}
	
	public static int factNum(int num) {
		
		if(num>=1) {
			return num*factNum(num-1);
		}
		else {
			return 1;
			
		}
		
	}

}
