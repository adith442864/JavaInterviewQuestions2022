
public class RemoveJunkAndSpecialChars {

	public static void main(String[] args) {
		
		String s = "@#$#$# testing !#@$#%#$%#$% Selenium #@#$%^$ Java";
		
		s = s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s);

	}

}
