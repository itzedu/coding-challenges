package hackerrank;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = {5, 10, 12, 15, 17, 18, 20, 22, 26};
		System.out.println(binarySearch(arr, 26));


	}
	
	public static boolean binarySearch(int[] input, int number) {
		if(number < input[0] || number > input[input.length - 1]) {
			return false;
		}
		
		int middle = (int) Math.floor(input.length / 2);
	
		if(number == input[middle]) return true;
	
		if(number < input[middle]) {
			return binarySearch(Arrays.copyOfRange(input, 0, middle), number);
		} else {
			return binarySearch(Arrays.copyOfRange(input, middle + 1, input.length), number);
		}
	}

}
