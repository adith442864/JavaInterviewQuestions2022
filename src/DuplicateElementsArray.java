import java.util.HashSet;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		String arr[] = {"Java","C", "C++", "Python", "Java"};
		
		/*
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Element Found.." +arr[i]);
					flag = true;
				}
			}
			
			
		}
		
		if(flag==false) {
			System.out.println("Duplicate Element Not Found...");
		}
		*/
		
		//2. HashSet Approach
		
		HashSet<String> lang = new HashSet();
		
		boolean flag = false;
		
		for(String e: arr) {
			if(lang.add(e)==false) {
				System.out.println("Duplicate Element Found:" +e);
				flag = true;
			}
		}
		
		if(flag==false) {
			System.out.println("No Duplicate Elements Found...");
		}
		
		
		
		
	}

}
