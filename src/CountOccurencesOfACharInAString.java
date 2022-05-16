
public class CountOccurencesOfACharInAString {

	public static void main(String[] args) {
		
		String str = "I love coding";
		
		//o - 2
		// I - 1
		
		//CharArray - for loops
		//str.len - charAt(i)
		//Apache Common StringUtils 
		//Streams
		
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch=='o') {
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
