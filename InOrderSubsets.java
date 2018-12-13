package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class InOrderSubsets {
	private static List<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		findSubsets("abc", "");
		System.out.println("Result - " + result);

	}
	
	public static void findSubsets(String str, String prefix) {
	    int length = str.length();
	    
	    result.add(prefix);

	    for (int i = 0 ; i < length; i++) {
	    	findSubsets(str.substring(i+1), prefix + str.substring(i, i + 1));
		}
			  
	}
}
