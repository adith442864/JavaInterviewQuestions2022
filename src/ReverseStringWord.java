
public class ReverseStringWord {

	public static void main(String[] args) {
		
		//Approach1:
		/*
		String str = "Welcome To Java"; //Original Word
		
		String words[] = str.split(" "); //Split string into multiple words
		
		String rev_String="";
		
		for(String w:words) { //Welcome 
			String revWord = "";
			
			for(int i=w.length()-1; i>=0; i--) {
				revWord=revWord + w.charAt(i);
			}
			
			rev_String = rev_String+revWord+" "; //emocleW oT avaJ
			
		}
		
		System.out.println("reversed words in a string is: " +rev_String);
		*/
		
		//Approach2:
		String str = "Welcome To Java"; 
		String words[] = str.split("\\s");
		
		String reverseWord="";
		
		for(String w: words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord=reverseWord+sb.toString()+" ";
		}
		
		System.out.println("Reversed words of a string is:" +reverseWord);

	}

}
