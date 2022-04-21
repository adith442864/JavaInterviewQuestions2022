
public class OctalToDecimal {

	public static void main(String[] args) {
		
	System.out.println(convertOctalToDecimal(116));	

	}
	
	public static int convertOctalToDecimal(int octal) {
		

		int decimalNum = 0, i=0;
		int remainder =0;
		
		
		while(octal!=0) {
			
			remainder = octal % 10;
			octal = octal / 10;
			decimalNum+= remainder * Math.pow(8, i);
			i++;
			
		}
		
		return decimalNum;
		
		
		
	}

}
