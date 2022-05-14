
public class StringFirstNonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "faadabcbbebdf";
		System.out.println(firstNonRepeatingCharacter(str));
	}

	public static int firstNonRepeatingCharacter(String string) {
		
		for(int i=0; i<string.length(); i++) {
			boolean flag = false;
			for(int j=0; j<string.length(); j++) {
				if(string.charAt(i)==string.charAt(j) && i!=j)
					flag = true;
			
			}
			
			if(!flag)
				return i;
		}
		return -1;
		
	}

}
