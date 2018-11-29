package hackerrank;

public class SingleRiffle {
	
	public static void main(String[] args) {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 3, 5, 6, 8};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        System.out.println(result);
	}
    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {
        // check if the shuffled deck is a single riffle of the halves
        
    	// edge cases: deck has more or less cards than halves combined
    	int totalCards = half1.length + half2.length;
    	if(shuffledDeck.length != totalCards) {
    		return false;
    	}
        // it will not be a single riffle if the cards are not in the original order of their respective arrays
        int firstIndex = 0;
        int secondIndex = 0;
        int deckIndex = 0;
        
        while(firstIndex < half1.length && secondIndex < half2.length) {
        	if(half1[firstIndex] == shuffledDeck[deckIndex]) {
        		firstIndex++;
        	} else if(half2[secondIndex] == shuffledDeck[deckIndex]) {
        		secondIndex++;
        	} else {
        		return false;
        	}
        	deckIndex++;
        }

        return true;
    }

}
