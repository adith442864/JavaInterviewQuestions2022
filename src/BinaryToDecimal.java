

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		//long num = 10011011;
		long num = 1001;
		int decimal = converBinaryToDecimal(num);
		System.out.println(decimal);
		
	}
	
	
	public static int converBinaryToDecimal(long num) {
		
		int decimalNumber = 0, i=0;
		int remainder=0;
		
		while(num!=0) {
			
			remainder = (int) (num % 10);  //10011011 -> 1001101
			num=num/10; // 1/10 -> 1, 0
			//decimalNumber = (int) (decimalNumber + remainder * Math.pow(2, i));
			decimalNumber+=remainder*Math.pow(2, i); // 1*2^0 = 1, 0*2^1....1+0+.......2^7
			i++;
		}
		
		return decimalNumber;
		
	}
}
