
public class ArrayToFindLargestNumber {

	public static void main(String[] args) {
		
		int array[] = {100,98,13,9,34};
		
		int max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i]>max)
				max=array[i];
		}
		
		System.out.println("Maximum number from array is :" +max);

	}

}
