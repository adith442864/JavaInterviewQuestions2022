import java.util.Scanner;

public class CountWordsString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); //Welcome to Java
		
		int count=1;
		
		for(int i=0; i<s.length(); i++) {
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		
		System.out.println("No of Words in a String: " +count);
		

	}

}
