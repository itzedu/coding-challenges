package hackerrank;

public class ReverseStringAnswer {
    public static void reverse(char[] arrayOfChars) {
    	for(int i = 0; i < arrayOfChars.length / 2; i++) {
    		char temp = arrayOfChars[i];
    		arrayOfChars[i] = arrayOfChars[arrayOfChars.length - i - 1];
    		arrayOfChars[arrayOfChars.length - i - 1] = temp;
    	}        
    }
}
