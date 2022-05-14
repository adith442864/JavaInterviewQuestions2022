
public class JavaString123 {

	public static void main(String[] args) {
		
		String str= "hoW aRE YOU";
		str=str.toLowerCase();

		String s[] = str.split(" ");
		
		String res = " ";
//		System.out.println(str.substring(0, 2).replace(str, str.toUpperCase()));
		
		for(int i=0; i<s.length; i++) {
			s[i]=s[i].replace(s[i].charAt(0), s[i].charAt(0)).toUpperCase();
			res = res+s[i]+" ";
			
			System.out.println(res);
			
		}
		
	
	}

}
