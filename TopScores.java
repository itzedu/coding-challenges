package hackerrank;

import java.util.HashMap;

public class TopScores {

	public static void main(String[] args) {
	   	int[] unsortedScores = {37, 89, 41, 65, 91, 53, 89};
	   	final int HIGHEST_POSSIBLE_SCORE = 100;
	   	
	   	sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
    	

	}
	
    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {
    	HashMap<Integer, Integer> scores = new HashMap<Integer, Integer>();
    	int[] result = new int[unorderedScores.length];
    	
    	for(int s : unorderedScores) {
    		Integer freq = scores.get(s);
    		
    		if(freq == null) {
    			scores.put(s, 1);
    		} else {
    			scores.put(s, freq + 1);
    		}
    	}
    	
    	int resultIndex = 0;
    	
    	for(int i = highestPossibleScore; i > -1; i--) {
    		Integer num = scores.get(i);
    		
    		if(!(num == null)) {
    			for(int j = 0; j < num; j++) {
    				result[resultIndex] = i;
    				resultIndex++;
    			}
    		}
    	}
    	
        return result;
    }

}
