
public class FactorsOfGivenNumber {

	public static void main(String[] args) {
		
		// 10 -> 1,2,5,10
		// 60 -> 1,2,3,4,5,10,12,15,20,30,60
		
		int num=10;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i+ " ");
			}
		}

	}

}
