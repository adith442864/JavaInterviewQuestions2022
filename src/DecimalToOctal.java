
public class DecimalToOctal {

	public static void main(String[] args) {
		// 78 -> 116
		System.out.println(convertDecimalToOctal(109));
		

	}
	
	public static int convertDecimalToOctal(int decimal) {
		
		int octalNum = 0, i=1;
		int remainder =0;
		
		
		while(decimal!=0) {
			
			remainder = decimal % 8;
			decimal = decimal / 8;
			octalNum+= remainder * i;
			i*=10;
			
		}
		
		return octalNum;
		
		
	}

}
