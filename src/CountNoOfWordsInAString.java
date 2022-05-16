import java.util.HashMap;
import java.util.Iterator;

public class CountNoOfWordsInAString {
	
	public static void findDuplicateWord(String str) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String s[] = str.split(" ");
		
		for(String tempString: s) {
			//System.out.println(tempString);
			if(hm.get(tempString)!=null) {
				hm.put(tempString, hm.get(tempString) +1);
			}
			else {
				hm.put(tempString, 1);
			}
		}
		
		Iterator<String> tempString = hm.keySet().iterator();
		while(tempString.hasNext()) {
			String temp = tempString.next();
			if(hm.get(temp) > 1) {
				System.out.println(" the word " + temp + " appeared " +hm.get(temp)+" no of times " );
			}
		}

	}
	
	public static void findDuplicatechar(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(hm.get(c)!=null) {
				hm.put(c, hm.get(c) +1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		Iterator<Character> tempString = hm.keySet().iterator();
		while(tempString.hasNext()) {
			Character temp = tempString.next();
			if(hm.get(temp) > 1) {
				System.out.println(" the word " + temp + " appeared " +hm.get(temp)+" no of times " );
			}
		}
	}


	public static void main(String[] args) {
		
		findDuplicateWord("I am am learning java java");
		findDuplicatechar("javaj2ee");
		

	}

}
