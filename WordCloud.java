package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;

public class WordCloud {
	public static void main(String[] args) {
        final String text = "I like cake";
        final WordCloud actual = new WordCloud(text);
        System.out.println(actual.getWordsToCounts());

	}
	
    private HashMap<String, Integer> wordsToCounts = new HashMap<>();
    
    private ArrayList<String> splitWords(String input) {
    	ArrayList<String> words = new ArrayList<String>();
    	String word = "";
    	
    	for(int i = 0; i < input.length(); i++) {
    		char letter = input.charAt(i);
    		if(Character.isLetter(letter) || letter == '\'' || letter == '-') {
    			word += letter;
    		} else {
    			if(!word.equals("") && !word.equals("-")) {    				
    				words.add(word);
    			}
    			word = "";
    		}
    	}
    	
		if(!word.equals("")) {    				
			words.add(word);
		}
		
    	return words;
    }

    private void populateWordsToCounts(String inputString) {
    	ArrayList<String> words = splitWords(inputString);
    	for(String word : words) {
    		Integer count = wordsToCounts.get(word);
    		
    		if(count == null) {
    			wordsToCounts.put(word, 1);
    		} else {
    			wordsToCounts.put(word, count + 1);
    		}
    	}

    }

    public WordCloud(String inputString) {
        populateWordsToCounts(inputString);
    }

    public HashMap<String, Integer> getWordsToCounts() {
        return wordsToCounts;
    }
}
