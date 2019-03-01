package ir.ac.kntu;

import java.util.Scanner;
import java.util.Arrays;

public class WordSplit {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
		input = input.trim();
		
		char[] arrayOfInput = input.toCharArray();
		for (int i=0 ; i < arrayOfInput.length; i++) {
			if (arrayOfInput[i] == ' ') {
				arrayOfInput[i] = ',';
			}
		}
		System.out.println(new String(arrayOfInput));
		
        scanner.close();
	}
	
}
