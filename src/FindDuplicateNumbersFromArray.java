
public class FindDuplicateNumbersFromArray {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
		
		// using brute force method:
		for(int i= 0; i<arr.length; i++) {
			
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) 	
			
			System.out.println("dupliates found :" +arr[j]);
		}
	  }
	}

}
