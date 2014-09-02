import java.awt.image.ConvolveOp;


public class IntegertoString {
	
	public static  String converIntToString(int input) {
		
		int rem = 0;
		boolean isNegative = false;
		if(input < 0) {
			isNegative = true;
			input = input * -1;
			
		}
		StringBuffer bf = new StringBuffer ();
		while (input > 0) {
			rem = input % 10;
			input = input /10;
			bf.append(rem);
		}
		if (isNegative) {
			bf.append("-");
		}
		bf.reverse();
		return bf.toString();
		
	}
	
	public static void main(String args []) {
		System.out.println(converIntToString(-21200));
		
	}

}
