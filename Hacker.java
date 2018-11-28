package hackerrank;

import java.util.Arrays;

public class Hacker {
	public static void main(String[] args) {
		
		String stringInput = "0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 1 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 0 0 0";
		String[] stringInputArr = stringInput.split(" ");
		
		int[] input = new int[100];
		int i = 0;
		for(String n : stringInputArr) {
			input[i] = Integer.parseInt(n);
			i++;
		}
		
		int answer = jumpingOnClouds(input);
		System.out.println(answer);
	}
	
    static int jumpingOnClouds(int[] c) {
        if(c.length == 2) return 1;
        
        int jumps = 0;

        for(int i = 0; i < c.length - 2; i++) {
            if(c[i + 2] == 0) {
                jumps++;
                i++;
            } else {
                jumps++;
            } 
        }

        if(c[c.length - 3] == 0) {
            jumps++;
        }
        return jumps;
    }
}
