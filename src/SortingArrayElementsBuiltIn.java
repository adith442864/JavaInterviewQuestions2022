import java.util.Arrays;
import java.util.Collections;

public class SortingArrayElementsBuiltIn {

	public static void main(String[] args) {
		
		Integer a[] = {30,50,20,10,40};
		
		// Approach - 1
		
		//System.out.println("Before Sorting :" +Arrays.toString(a));
		//Arrays.parallelSort(a);
		//System.out.println("After Sorting :" +Arrays.toString(a));
		
		//Approach 2:
//		System.out.println("Before Sorting :" +Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("After Sorting :" +Arrays.toString(a));
		
		//Descending/Reverse Order
		System.out.println("Before Sorting :" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("After Sorting :" +Arrays.toString(a));

	}

}
