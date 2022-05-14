
public class CountNoOfCharactersUsingNaive {
	
	static final int MAX_CHAR=256;

	public static void main(String[] args) {
		
		String str = "Hello Welcome To Java";
		
		//create an array of size 256
		// i.e. ASCII_SIZE
		
		int count[] = new int[MAX_CHAR];
		
		//initialize count array index
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
			
		}
		
		//create an array of given string size
		char[] ch = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
			int find = 0;
			
			for(int j=0; j<=i; j++) {
				if(str.charAt(i)== ch[j]) {
					find++;
				}
			}
			
			if(find==1) {
				System.out.println("Number of Occurences: "+str.charAt(i)+" " +count[str.charAt(i)]);
			}
		}
		
		

	}

}
