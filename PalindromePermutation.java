package hackerrank;

import java.util.HashMap;

public class PalindromePermutation {
	public static void main(String[] args) {
        final boolean result = hasPalindromePermutation("aabcd");
        System.out.println(result);
	}
	
    public static boolean hasPalindromePermutation(String theString) {
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	for(int i = 0; i < theString.length(); i++) {
    		Character ch  = theString.charAt(i);
    		Integer count = map.get(ch);
    		
    		if(count == null) {
    			map.put(ch, 1);
    		} else {
    			map.put(ch, count + 1);
    		}
    	}
    	
    	// if string is even length, no count can be odd
    	// if the string is odd, we can only have one character that is odd (the middle)
    	
    	boolean foundOdd = false;
    	int numberOfOdds = 0;
    	
    	for(Character key : map.keySet()) {
    	   if(map.get(key) % 2 == 1) {
    		   foundOdd = true;
    		   numberOfOdds++;
    	   }
    	}
    	
    	if(theString.length() % 2 == 0) {
    		if(foundOdd) {
    			return false;
    		} else {
    			return true;
    		}
    	} else {
    		if(numberOfOdds > 1) {
    			return false;
    		} else {
    			return true;
    		}
    	}
    }

}
