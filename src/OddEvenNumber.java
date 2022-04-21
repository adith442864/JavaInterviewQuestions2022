import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter number: ");
		
		int num = reader.nextInt();
		
		if(num%2==0)
			System.out.println(num + " is Even");
		else
			System.out.println(num +" is Odd");

	}

}
