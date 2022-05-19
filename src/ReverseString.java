
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello World";
		String rev="";
		
		//1. using charAt Method()
		/*
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		} */
		 
		
		//2. using toCharArray Method
		char[] s = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+s[i];
		}
		
		//3. Using StringBuffer Class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("reversed string is:" +sb.reverse());
		
		System.out.println("Reversed String is :" +rev);
		

	}

}
