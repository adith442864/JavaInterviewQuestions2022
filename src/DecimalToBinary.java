
public class DecimalToBinary {

	public static void main(String[] args) {
		
		// 9 = 1001
		
		long binary = convertDecimalToBinary(156);
		System.out.println(binary);

	}
	
	public static long convertDecimalToBinary(int n) {
		
		int remainder =1, i=1;
		long binaryNum =0;
		
		while(n != 0) {
			
			remainder = n % 2;
			n = n / 2;
			binaryNum += remainder * i;
			i=i*10;
	
		}
		
		return binaryNum;
		
	}

}
