package com.interviewprep.recursion;

public class Combinations {
	
	public static void generateCombinations(char input[], int start, StringBuffer sb) {
		
		if(start == input.length)
		{
			return;
		}
		for(int i=start; i < input.length ; i++) {
			sb.append(input[i]);
			System.out.println(sb.toString());
			generateCombinations(input, i+1, sb);
			sb.setLength(sb.length()-1);
		}
		
	}
	
	public static void main(String args[]) {
		String temp = "ABCD";
		char input [] = {'A','B','C','D'};
		boolean used [] = new boolean [temp.length()];
		StringBuffer sb = new StringBuffer();
		generateCombinations(input,0, sb);
	}


}
