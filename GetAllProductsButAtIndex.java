package hackerrank;

import java.util.Arrays;

public class GetAllProductsButAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProductsOfAllIntsExceptAtIndex(new int[] {1, 7, 3, 4});
	}

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {
    	// make an array of the products
    	// however we cannot use division for this problem
    	int[] result = new int[intArray.length];
    	
    	for(int i = 0; i < intArray.length; i++) {
    		int product = 1;
    		for(int j = 0; j < intArray.length; j++) {
    			if(j != i) {
    				product *= intArray[j];
    			}
    		}
    		result[i] = product;
    	}
        
    	System.out.println(Arrays.toString(result));
        return result;
    }
}
