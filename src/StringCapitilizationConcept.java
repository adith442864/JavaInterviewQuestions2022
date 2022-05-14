
public class StringCapitilizationConcept {

	public static void main(String[] args) {
		
		String str = "hello hOw aRe yOu";
		
		String words[] = str.split(" ");
		
		String capitalizeStr= " ";
		
		for(String word: words) {
			String first = word.substring(0,1);
			String remaining = word.substring(1).toLowerCase();
			
			capitalizeStr += first.toUpperCase()+remaining+" ";
			
			
		}
		
		System.out.println(capitalizeStr);
	}

}
