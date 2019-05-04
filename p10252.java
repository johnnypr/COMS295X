package Uva;
import java.util.*;
import java.io.*;


public class Main {
	
	public void permutations() {
		Scanner scanner = new Scanner(System.in);
		/**
		 * Given two strings of lowercase letters, a and b
		 * So we get the data from the user 
		 * */
		
		while(scanner.hasNextLine()) {
			String x = "";
			String a = scanner.nextLine();
			String b = scanner.nextLine();
		
			/**
			 *We need a place to store mutations and a way
			 *to retrieve them  
			 **/
			int[] storeA = new int[26]; 
			int[] storeB = new int[26];

			for(int i=0; i < a.length(); i++) {
				storeA[a.charAt(i) - 'a'] += 1;
			}

			for(int j=0; j < b.length(); j++) {
				storeB[b.charAt(j) - 'a'] += 1;
			}
			
			for(int k=0; k < 26; k++) {
				for(int m=0; m < storeA[k] && m < storeB[k]; m++) {
					x+=(char)(k+'a');
				}
			}
			
			System.out.println(x);
		}
		
		scanner.close();
	}
		
	
	
	
	public static void main(String[] args) {
		new Main().permutations();
		
		
		
		
	}
	

}