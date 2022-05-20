
public class StringsEndWithParticularCharacter {

	public static void main(String[] args) {
		
		String str = "Java is a programming language";
		
		boolean endsWith = str.endsWith("e");
		System.out.println("String ends with character e: " +endsWith);
		
		boolean endsWithText = str.endsWith("language");
		System.out.println("String ends with String Text " +endsWithText);
		
		System.out.println(str.indexOf('a')); //1st occurence
		System.out.println(str.indexOf('a',str.indexOf('a')+1)); //2nd occurence
		
		//replace:
		String s1 = "Java for dummies";
		System.out.println(s1.replace("dummies", "experts"));
		
		String s2 = "Java,C,Python,Perl";
		String s[] = s2.split(",");
		for(String e: s) {
			System.out.println(e);
		}
		
		//remove spaces before and after a given string:
		String s3 = "  Interview Questions for Java   ";
		System.out.println(s3.replaceAll(" ","").trim());
	
		//Concatenate two strings:
		String s4 = "Interview Questions for Java"+" ";
		String s5 = "And Selenium";
		
		System.out.println(s4.concat(s5));
		
		
		
		

	}

}
