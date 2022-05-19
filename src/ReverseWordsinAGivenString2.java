
public class ReverseWordsinAGivenString2 {

	public static void main(String[] args) {
		
		String str = "i like this program very much";
		
		String s[] = str.split(" ");
		String ans= "";
		
		for(int i=s.length-1; i>=0; i--) {
			ans = ans+s[i]+" "; //much very program like this i
			
		}
		
		System.out.println("Reversed String:");
		System.out.println(ans.substring(0,ans.length()-1));
		
		

	}

}
