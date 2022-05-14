
public class PrimeNumberCheck {
	
	//Prime Number Factors:
		// Natural Number >1
		// which has only 2 factors 1 and itself
	
	//19 ==> 1 and 19 ==> Prime Number
	//28 ==> 1, 2, 4,7,14,28
	
	//Example: 2,3,5,7,11,13,17

	public static void main(String[] args) {
		
		int num=7;
		int count=0;
		
		if(num > 1) {
			
			for(int i=2; i<=num; i++) 
			{
				if(num%i==0) 
					count++;
			}
			
			if(count==2) 
			{
				System.out.println(num+ ": is a Primer Number");
			}
			else {
				System.out.println(num+ ": is Not a Primer Number");
			}
		}
		else {
			System.out.println(num+ ": Not a Prime Number");
		}
	  
				
	}
	

}
