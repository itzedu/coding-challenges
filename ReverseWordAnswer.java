package hackerrank;

import java.util.Arrays;

public class ReverseWordAnswer {

	public static void main(String[] args) {
		char[] message = "".toCharArray();

	}
	
    public static void reverseWords(char[] message) {
    	if(message.length == 0) {
    		return;
    	}
    	
    	for(int i = 0; i < message.length / 2; i++) {
    		char temp = message[i];
    		message[i] = message[message.length - i - 1];
    		message[message.length - i - 1] = temp;
    	}
    	    	
    	int j = 0;
    	boolean reversed = false;
    	
    	while(!reversed) {
    		int k = j;

        	while(message[j] != ' ') {
        		if(j == message.length - 1) {
        			j++;
        			break;
        		} else {        			
        			j++;
        		}
        	}
        	
    		System.out.println("K:" + k);
    		System.out.println("J:" + j);
        	for(int itr = 0; itr < (j - k) / 2; itr++) {
        		char temp = message[k + itr];
        		System.out.println(temp);
        		message[k + itr] = message[j - itr - 1];
        		message[j - itr - 1] = temp;
        		System.out.println("inside");
        		System.out.println(message);
        	}

        	        	
        	j++;
        	
       		if(j >= message.length) {
    			reversed = true;
    		} 
    	}	
    	
    }

}
