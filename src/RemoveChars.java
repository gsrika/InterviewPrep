
public class RemoveChars {
	
	
	
	public static String removeCharecters (String input, String removal) {
		if(input == null) {
			return null;
		}
		if (removal == null) {
			return input;
		}
		boolean [] flag = new boolean [128];
		for(int i=0; i<128; i++) {
			flag [i] = false;
		}
		
		for(int i=0; i< removal.length();i++) {
			flag[removal.charAt(i)] = true;
			
		}
		
		StringBuilder  sb = new StringBuilder();
		for(int i=0;i < input.length(); i++) {
			if(flag[input.charAt(i)]==false) {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		
		String sample = "a";
		System.out.println(removeCharecters("HelloABCD", "oABC"));
		
	}

}
