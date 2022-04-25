
public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "ABCD";
		
		//1. Using + (String concatenation) operator
		String rev="";
		
		/*
		for(int i=str.length()-1; i>=0; i--) { //3 2 1 0 
			rev = rev+str.charAt(i); //D D+C = DC DCB DCBA

		}
		*/
		
		//2. Using Character Array:
		/*
		char s[] = str.toCharArray();
		int len = s.length;
		
		for(int i=len-1; i>=0; i--) { //3 2 1 0
			rev=rev+s[i]; //D DC DCB DCBA
			System.out.println("Reversed String is :" +rev);
		} */
		
		//Using StringBuffer Class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("reversed string is:" +sb.reverse());
		
		
		
		
	}

}
