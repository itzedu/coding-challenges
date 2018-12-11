package hackerrank;

import java.util.Arrays;
import java.util.Random;

public class UniformInPlaceShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int[] initial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(initial);
        System.out.println(Arrays.toString(initial));
	}

    private static int getRandom(int floor, int ceiling) {
    	Random rand = new Random();
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }

    public static void shuffle(int[] theArray) {
        // shuffle the input in place
        if (theArray.length <= 1) {
            return;
        }
        
    	for(int i = 0; i < theArray.length; i++) {
    		int randomIndex = getRandom(0, theArray.length-1);
    		int temp = theArray[i];
    		theArray[i] = theArray[randomIndex];
    		theArray[randomIndex] = temp;
    	}
    }
}
