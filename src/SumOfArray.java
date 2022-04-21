
public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		int sum=0;
		
		//Approach 1:
		/*
		for(int i=0; i<a.length; i++) { //0 1 2 3 4  //a.length-4 = 4 
			sum=sum+a[i]; //5+2+7+9+6
		}*/
		
		//enhanced for loop:
		for(int i: a) {
			sum=sum+i;
		}
		
		System.out.println("Sum of Array Elements:" +sum);

	}

}
