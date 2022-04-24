
public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,30};
		
		int x = 60;
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) {
				System.out.println("Element Found :" + i);
				flag = true;
				break;
			}
		}
		
		if(flag ==false) {
			System.out.println("Element Not Found...");
		}

	}

}
