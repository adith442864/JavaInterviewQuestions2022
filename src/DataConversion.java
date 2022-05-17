
public class DataConversion {

	public static void main(String[] args) {
		
		//Wrapper Classes: Integer, Double
		
		String x = "100";
		System.out.println(x+20); //10020
		
		// string to int:
		int i = Integer.parseInt(x); //100
		System.out.println(i+20);
		
//		String y = "100A";		
//		int j = Integer.parseInt(y);
//		System.out.println(j); //java.lang.NumberFormatException
		
		String p = "12.33";
		System.out.println(p+20);
		double d = Double.parseDouble(p);
		System.out.println(d+20);
		
		//int to string:
		int total = 100;
		String t = String.valueOf(total);
		System.out.println(t+20);
		
		String g="true";
		if(Boolean.parseBoolean(g)) {
			System.out.println("PASS");
		}
		

	}

}
