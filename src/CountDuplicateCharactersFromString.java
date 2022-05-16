import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharactersFromString {

	public static void main(String[] args) {
		
//		String str = "Java";
		findDuplicateChar("A");
		findDuplicateChar("");
		findDuplicateChar(null);
		findDuplicateChar("java");
		findDuplicateChar("naveen");
		findDuplicateChar("tesla");

	}
	
	public static void findDuplicateChar(String str) {
		
		if(str == null) {
			System.out.println("Null String");
		return;
		}
		
		if(str.isEmpty()) {
		System.out.println("Empty String...");
		return;
		}
		
		if(str.length() == 1) {
			System.out.println("Single character");
		return;
		}
		
		char words[] = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap();
		
		for(char ch: words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		
		//print the map
//		System.out.println(charMap);
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet) {
			if(entry.getValue() >1)
			System.out.println(entry.getKey() +" : " +entry.getValue());
		}
		
	}

}
