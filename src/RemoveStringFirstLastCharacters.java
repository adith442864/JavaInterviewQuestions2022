
public class RemoveStringFirstLastCharacters {

	public static void main(String[] args) {
		
		String str = "Hello Java World";
		
		//1st Approach: using SubSTring
//		str = str.substring(1, str.length()-1);
		
		//2. using StringBuilder
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(str.length()-1);
		sb.deleteCharAt(0);
		System.out.println(sb.toString());

	}

}
