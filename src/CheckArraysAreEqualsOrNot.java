import java.util.Arrays;

public class CheckArraysAreEqualsOrNot {

	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		//1. Using Equals Method()
/*		boolean status = Arrays.equals(a1, a2);
		
		if(status==true) {
			System.out.println("Arrays are Equal...");
		}else {
			System.out.println("Arrays are Not Equal...");
		}
*/
		
		//2nd Appraoch:
		
		boolean status = true;
		if(a1.length == a2.length) {
			//compare rest of elements:
			
			for(int i=0; i<a1.length; i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
				
				
			}
			
			
			
		}
		else {
			status=false;
			
		}
		
		if(status==true) {
			System.out.println("Arrays are Equal...");
		}else {
			System.out.println("Arrays are Not Equal...");
		}
		

	}

}