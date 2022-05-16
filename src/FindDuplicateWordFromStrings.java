import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateWordFromStrings {

	public static void main(String[] args) {
		
		String names[] = {"Java", "JavaScript", "Python", "Ruby", "Java"};
		
		// using brute force method:
		for(int i=0; i<names.length; i++) {
			
			for(int j=i+1; j<names.length; j++){
				if(names[i].equals(names[j])) 
					//got the duplicate element
				System.out.println(names[j]);
			}
			
		}
		
		//2. using HashSet Data Structure:
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name) == false) {
				System.out.println(name);
			}
		}

	

	}

}
