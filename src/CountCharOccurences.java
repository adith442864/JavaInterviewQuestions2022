
public class CountCharOccurences {

	public static void main(String[] args) {
		
		String s= "Java Programming Java oops";
		
		int totalCount = s.length(); //total length of the string
		int totalCount_afterRemovea = s.replace("a", "").length(); //total len after removing all a's
		int count =  totalCount-totalCount_afterRemovea;
		
		System.out.println(count);
		

	}

}
