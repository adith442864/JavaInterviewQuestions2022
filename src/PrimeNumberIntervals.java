
public class PrimeNumberIntervals {

	public static void main(String[] args) {
		
		// 20 To 50 Within a Range: 
		int low =20;
		int high=50;
		
		while(low<high) {
			
			boolean flag = false;
			for(int i=2; i<low/2; i++) {
				
				if(low % i == 0)
					flag=true;
				break;
			}
			
			if(!flag) {
				System.out.println(low+ " " );
			}
			
			low++;
			
		}
		
		

	}

}
