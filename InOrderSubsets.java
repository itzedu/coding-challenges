package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class InOrderSubsets {
	private static List<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		findSubsets("abc", "", "abc");
		System.out.println("Result - " + result);

	}
	
	public static void findSubsets(String str, String prefix, String suffix) {
		System.out.println("Result - " + result);
		System.out.println("Prefix - " + prefix);
		System.out.println("Suffix - " + suffix);
		System.out.println("****************************");
		for(int i = 0; i < suffix.length(); i++) {
			
			if(prefix.equals("")) {				
				prefix = str.substring(i, i + 1);
				suffix = suffix.substring(1);
			}
			
			String word = prefix + suffix;
			System.out.println("Word - " + word);

			if(word.equals(str)) {
				result.add(prefix);
			} else {
				result.add(prefix + suffix.substring(i, i + 1));
			}
			findSubsets("abc", prefix, suffix);
			
		}
			  
	}

}
