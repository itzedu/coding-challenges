package hackerrank;

import java.util.Arrays;

public class GetAllProductsButAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProductsOfAllIntsExceptAtIndexReview(new int[] {1, 7, 3, 4});
	}
	
    public static int[] getProductsOfAllIntsExceptAtIndexReview(int[] intArray) {
    	// make an array of the products
    	// however we cannot use division for this problem
        
    	if (intArray.length < 2) {
            throw new IllegalArgumentException("Array needs at least 2 numbers");
        }
    	
    	int[] products = new int[intArray.length];

    	products[0] = 1;
    	
    	for(int i = 1; i < intArray.length; i++) {
    		products[i] = products[i-1] * intArray[i-1]; 
    	}

        // for each integer, we find the product of all the integers
        // after it. since each index in products already has the
        // product of all the integers before it, now we're storing
        // the total product of all other integers
        int productSoFar = 1;
        
        for (int i = intArray.length - 1; i >= 0; i--) {
        	products[i] *= productSoFar;
            productSoFar *= intArray[i];
        }
    	
    	System.out.println(Arrays.toString(products));
        return products;
    }

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {
    	// make an array of the products
    	// however we cannot use division for this problem
    	// this is done in a O(n^2) runtime
    	
    	if (intArray.length < 2) {
            throw new IllegalArgumentException("Array needs at least 2 numbers");
        }
    	
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
