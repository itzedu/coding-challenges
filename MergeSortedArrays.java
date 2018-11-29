package hackerrank;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] myArray = {2, 4, 6, 8};
	    int[] alicesArray = {1, 7};
		System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
	}
	
    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {
    	int myIndex = 0;
    	int alicesIndex = 0;
    	int resultIndex = 0;
    	int[] result = new int[myArray.length  +  alicesArray.length];
    	
//    	3 < 4 && 2 < 2
    	while(myIndex < myArray.length && alicesIndex < alicesArray.length) {
    		if(myArray[myIndex] <= alicesArray[alicesIndex]) {
    			result[resultIndex] =  myArray[myIndex];
    			myIndex++;
    		} else {
    			result[resultIndex] =  alicesArray[alicesIndex];
    			alicesIndex++;
    		}
    		resultIndex++;
    	}
    	
    	boolean myArrayShorter = myIndex < myArray.length;
 
    	// loop through the rest of the remaining numbers
    	if(myArrayShorter) {
    		for(; myIndex < myArray.length; myIndex++) {
    			result[resultIndex] = myArray[myIndex];
    			resultIndex++;
    		}
    	} else {
    		for(; alicesIndex < alicesArray.length; alicesIndex++) {
    			result[resultIndex] = alicesArray[alicesIndex];
    			resultIndex++;
    		}
    	}
        
    	return result;
    }


}
