package hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class MovieFlight {
	public static void main(String[] args) {
//		int[] movieLengths = {3, 8};
		
      System.out.println(canTwoMoviesFillFlightOptimized(new int[] {2, 4}, 6));
//        final boolean result = canTwoMoviesFillFlight(new int[] {1, 2, 3, 4, 5, 6}, 7);

//		System.out.println(canTwoMoviesFillFlightOptimized(movieLengths, 6));
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

    public static boolean canTwoMoviesFillFlightOptimized(int[] movieLengths, int flightLength) {
    	HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
    	
    	for(int i = 0; i < movieLengths.length; i++) {
    		Integer frequency = map.get(movieLengths[i]);
    		
    		if(frequency == null) {
    			map.put(movieLengths[i], 1);
    		} else {
    			map.put(movieLengths[i], frequency + 1);
    		}    	
    	}
    	
    	for(int movie : movieLengths) {
    		int possibleComplement = flightLength - movie;
    		
    		Integer frequency = map.get(possibleComplement);
    		
    		// found a counter part
    		if(frequency !=  null) {
    		    // check if there are more than 1 movie when they are of the same value;
    			if(possibleComplement == movie) {
    				if(frequency > 1) {
    					return true;
    				} else {
    					continue;
    				}
    			} else {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }

}
