package hackerrank;

import java.util.Arrays;

public class MovieFlight {
	public static void main(String[] args) {
		int[] movieLengths = {1, 6, 5, 8, 7};
		canTwoMoviesFillFlight(movieLengths, 12);
	}
	
    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
    	// sort collection first
    	Arrays.sort(movieLengths);
    	System.out.println(Arrays.toString(movieLengths));
    	
    	int start = 0;
    	int end = movieLengths.length - 1;
    	
    	while(start < end) {
    		int sum = movieLengths[start] + movieLengths[end];
    		if(sum == flightLength) {
    			return true;
    		} else if(sum < flightLength) {
    			start++;
    		} else {
    			end--;
    		}
    	}

        return false;
    }


}
