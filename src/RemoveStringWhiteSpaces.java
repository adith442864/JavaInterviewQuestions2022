
public class RemoveStringWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "Selenium        Testing            java";
		
		System.out.println("Before removing white spaces" +s);
		
		s = s.replaceAll("\\s", "");
		System.out.println("After removing white spaces:" +s);

	}

}
