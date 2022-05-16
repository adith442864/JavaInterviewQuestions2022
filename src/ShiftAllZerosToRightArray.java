import java.util.Arrays;

public class ShiftAllZerosToRightArray {
	
	
	public static int[] ShiftZeroToRight(int[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int newArray[] = new int[arr.length];
		int count =0;
		
		for(int number: arr) {
			if(number!=0) {  //condition for non zero numbers
				newArray[count] = number;
				count++;
			}
		}
		
		return newArray;
		
	}

	public static void main(String[] args) {
		// test cases:
		int i[] = {1,0,2,0,3,0,0,0};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));
		
		i = new int[] {0,2,2,0,3,0,0,0};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));
		
		i = new int[] {1,2,3,0};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));
		
		i = new int[] {1,2,3};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));
		
		i = new int[] {0,0,0};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));
		
		i = new int[] {2};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));

	}

}
