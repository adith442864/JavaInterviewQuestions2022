import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {4,1,2,5,3};
		
		System.out.println("Arrays Before Sorting: " +Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0; i<n; i++) { //Number of passes
			
			for(int j=i+1; j<n; j++) {
				
				if(a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
			
		}
		
		System.out.println("Arrays After Sorting: " +Arrays.toString(a));
		
		
	}

}
