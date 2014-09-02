
public class ReverseWords {
	
	public static char[] reverseWords(char [] input) {
		int len = input.length;
		int firstIndex = 0;
		int lastIndex = 0;
		
		while(firstIndex < len && lastIndex < len) {
			while(firstIndex < len && input[firstIndex] == ' ') {
				firstIndex ++;
			}
			lastIndex = firstIndex;
			while(lastIndex < len ) {
				if(input[lastIndex] == ' ' && lastIndex -1 >=0 && input[lastIndex-1] != ' ' ) {
					break;
				}
				else {
					lastIndex ++;
				}
			}
			lastIndex = lastIndex -1;					
			reverse(input,firstIndex,lastIndex);
			firstIndex = lastIndex + 1;			
		}	
		reverse(input,0,len-1);
		return input;
	
	}
	
	private static void reverse(char[] input, int firstIndex, int lastIndex) {
		while (firstIndex < lastIndex) {
			char c = input [firstIndex];
			input [firstIndex] = input[lastIndex];
			input [lastIndex] = c;
			firstIndex ++;
			lastIndex --;
		}
		
    }

	public static void main (String args[]) {
		
		char input [] = {'H','E','L',' ','H','O','W'};
		
		System.out.println(reverseWords(input));
		
	}

}
