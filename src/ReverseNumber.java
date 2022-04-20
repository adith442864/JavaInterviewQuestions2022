
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 2345;
		
		System.out.println("Entered number is : " +num);
		
		//1. using algorithm
		/*
		int rev = 0;
		while(num!=0) {
			rev= rev*10 + num % 10; //(0*10 = 0 + 1234 % 10) => 4 (0+4 = 4) , 40+3 =43 , 430+2 = 432 , 4320+1 = 4321
			num = num /10; //1234/10 = 123 , 123/10 = 12 , 12/10 =1, 1/10=0
		} */
		
		//2. StringBuffer
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(num)); //conver num into string format
		System.out.println("actual number is :" +sb.reverse());
		*/
		
		//3. StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("Reversed number is : " +rev);
		

	}

}
