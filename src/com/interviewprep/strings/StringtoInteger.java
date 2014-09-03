package com.interviewprep.strings;
import javax.management.RuntimeErrorException;


public class StringtoInteger {
	
	
	public static int converStringtoInt(String input) {
		
		if(input == null || input.length() == 0) {
			throw new RuntimeException("String format doesn't fit into integer");
		}
		
		int multiplier  =  1;
		if(input.startsWith("-")) {
			multiplier = multiplier * -1;
		}
		int factor = 1;
		int number = 0;
		for(int i = input.length()-1 ; i >= 0 ;i--) {
			if(input.charAt(i) == '-') {
				break;
			}
			number = (number  ) +  ( input.charAt(i) - '0') * factor;
			factor = factor * 10;
		}
		
		return multiplier * number;
	}
	
	public static void main(String args[]) {
		System.out.println(converStringtoInt("-100"));
		
	}

}
