
public class StringManipulationConcept {

	public static void main(String[] args) {
		
		String s = "This is my java code and I am so happy";
		String s1 = "This is my java code and I am so happy java is best";
		
		System.out.println(s.length()); //38
		System.out.println(s.charAt(0)); //T
		System.out.println(s.charAt(37));//y
		
//		System.out.println(s.charAt(38)); //java.lang.StringIndexOutOfBoundsException
//		System.out.println(s.charAt(-1)); ////java.lang.StringIndexOutOfBoundsException
		
		System.out.println(s1.indexOf("j")); //11
		System.out.println(s1.indexOf('i')); //1st Occurence of i -- 2
		System.out.println(s1.indexOf('i', s1.indexOf('i')+1)); //2nd Occurence of i -- 5
		System.out.println(s1.indexOf('i', s1.indexOf('i', s1.indexOf('i')+1)+1)); //3rd Occurence of i -- 44
		
		System.out.println(s.indexOf("code")); //16
		System.out.println(s.indexOf("python")); //-1
		
		
		String mesg = "Welcome Admin";
		if(mesg.indexOf("Admin") >0 ) { //8>0
			System.out.println("PASS");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String st = "   hello world    ";
		System.out.println(st.trim());
		
		System.out.println(st.replace(" ", ""));
		
		String dob="01-01-1990"; //format: 01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		
		//contains:
		String str = "your user id is naveenautomation";
		System.out.println(str.contains("naveenautomation"));
		if(str.contains("naveenautomation")) {
			System.out.println("PASS");
		}
		
		//comparison:
		String t1 = "hello java"; //String literals
		String t2 = "hello java";
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2); //true on basis of string values.
		
		String t3 = new String("hello ruby"); //new keyword - creating object inside help - 2 Objects (SCP + HEAP)
		String t4 = "hello ruby"; // 0
		String t5 = new String("hello ruby"); //1 (Heap)
		
		System.out.println(t3==t5); //false -- comparison on basis of object references
		System.out.println(t3==t4); //false 
		
		// After JDK 1.7 SCP is part of Heap Memory. All references created inside stack...
		
		//split:
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String[] langArray = lang.split("_");
		System.out.println(langArray[0]);
//		System.out.println(langArray[4]); //ArrayIndexOutOfBounds
		
		for(String l: langArray)
		{
			System.out.println(l);
		}
		
		String name="xXtestingxXjavaxXXseleniumXxXpython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr.length);
		System.out.println(nameArr[0]); //blank
		System.out.println(nameArr[1]); 
		System.out.println(nameArr[2]);
		System.out.println(nameArr[3]);
		System.out.println(nameArr[4]);
		
		String empData ="Hirel;Patel;40;NY;USA;01-01-1970;selenium;QA";
		String emp[] = empData.split(";");
		
		for(String e: emp) {
			System.out.println(e);
		}
		
		String credentials = "admin;admin123";
		System.out.println(credentials.split(";")[0]);
		System.out.println(credentials.split(";")[1]);
		
		
		//
		String message = "your order id is 12345";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17, message.length()));
		
		System.out.println(message.substring(message.indexOf("is")+3,message.length()));
		String orderId = message.substring(message.indexOf("is")+3,message.length());
		System.out.println(orderId);
		

	}

}
