
public class PermutationsOfString {
	
	public static void findPermutaionsofString(char a[], int i , int len) {
		
		if(i == len){
			for(int j=0; j< len; j ++) {
				System.out.print(a[j]);
			}
			System.out.println();
			return;
		}
		
		for(int j=i;j< len ;j++ ){
			swap(a,i,j);
			findPermutaionsofString(a, i+1, len);
			swap(a,i,j);
			
		}
		
	}
	
	
	public static void permute(String s, StringBuffer bf, boolean used[]) {
		if (s.length() == bf.length()) {
			System.out.println(bf.toString());
			return;
		}
		for( int i=0; i < s.length() ;i++) {
			if(used[i]) continue;
			used[i] = true;
			bf.append(s.charAt(i));
			permute(s,bf,used);
			used[i]= false;
			bf.setLength(bf.length()-1);
		}
		
	}
	
	public static void swap(char a[],int i, int j) {
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
		
	}
	
	public static void main(String args[]){
		
		char a [] = {'A','B','C','D'};
		String temp = "ABCD";
		boolean used [] = new boolean [temp.length()];
		StringBuffer sb = new StringBuffer();
		permute(temp, sb,used);
			
	}

}
