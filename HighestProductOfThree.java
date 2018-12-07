package hackerrank;

public class HighestProductOfThree {
	public static void main(String[] args) {
//		highestProductOf3(new int[] {-5, -1, -3, -2});
		System.out.println(highestProductOf3(new int[] {-10, 1, 3, 2, -10}));
	}
	
	public static int highestProductOf3(int[] intArray) {
		// calculate the highest product of three numbers

		if(intArray.length < 3) {
		    throw new IllegalArgumentException("Need at least 3 numbers");
		}
		
		int greatest = Integer.MIN_VALUE;
		int secondGreatest = Integer.MIN_VALUE;
		int thirdGreatest = Integer.MIN_VALUE;
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int thirdSmallest = Integer.MAX_VALUE;
		
		// get the 3 maximum numbers of a list if they are all positive
		for(int i = 0; i < intArray.length; i++) {
			if(greatest < intArray[i]) {
				thirdGreatest = secondGreatest;
				secondGreatest = greatest;
				greatest = intArray[i];
			} else if(secondGreatest < intArray[i] && intArray[i] <= greatest) {
				thirdGreatest = secondGreatest;
				secondGreatest = intArray[i];
			} else if(thirdGreatest < intArray[i] && intArray[i] <= secondGreatest) {
				thirdGreatest = intArray[i];
			}
			
			if(smallest > intArray[i]) {
				thirdSmallest = secondSmallest;
				secondSmallest = smallest;
				smallest = intArray[i];
			} else if(secondSmallest > intArray[i] && intArray[i] >= smallest) {
				thirdSmallest = secondSmallest;
				secondSmallest = intArray[i];
			} else if(thirdSmallest > intArray[i] && intArray[i] >= secondSmallest) {
				thirdSmallest = intArray[i];
			}
		}
		
		System.out.println("max: " + greatest);
		System.out.println("2nd max: " + secondGreatest);
		System.out.println("3rd max: " + thirdGreatest);
		
		System.out.println("min: " + smallest);
		System.out.println("2nd min: " + secondSmallest);
		System.out.println("3rd mind: " + thirdSmallest);
		// if all numbers are negative or positive, the highest product is the multiplication of the biggest numbers
		if(greatest < 0 || smallest > 0) {
			System.out.println("came to the first if");
			return greatest * secondGreatest * thirdGreatest;
		}
		
		int greatestProduct = greatest * secondGreatest * thirdGreatest;
		// two negatives in our set is edge case
		if(smallest < 0 && secondSmallest < 0) {
			System.out.println("came to the 2nd if");
			int possibleProduct = smallest * secondSmallest * greatest;
			
			if(possibleProduct > greatestProduct) {
				System.out.println("came to the third if");
				return possibleProduct;
			}
		}
		return greatestProduct;
	}
}
