
public class SwapNumbers {

	public static void main(String[] args) {
		
		// 1.with temporary var:
		
		int a=10;
		int b=20;
		
//		System.out.println("before swapping");
//		System.out.println("a= "+a);
//		System.out.println("b= "+b);
//		
//		System.out.println("after swapping");
//		//swapping with third variable:
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
		
//		System.out.println("a= "+a);
//		System.out.println("b= "+b);
		
		//2.without temp:
		/*
		System.out.println("before swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("after swapping");
		a=a-b; //10-20 = -10
		b=a+b; //20-10 = 10
		a=b-a; //10-(-10) =20
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		*/
		
		//3. Using * and / Operators:
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a is "+a +" and b is " +b);
		

	}

}
