package com.interviewprep.recursion;
import java.util.HashMap;
import java.util.Map;


public class T9 {
	
	
	public static void implementT9 (int a[], StringBuffer sb, int index,Map<Integer,String> values) {
		
		if( a.length == index)
		{
			System.out.println(sb.toString());
			return;
		}
		String travelValues = values.get(a[index]);
		for(int i = 0 ; i< travelValues.length() ; i++ ) {
			sb.append(travelValues.charAt(i));
			implementT9(a, sb, index +1, values);
			sb.setLength(sb.length()-1);
		}					
		
	}
	
	public static void callerT9(int number) {
		StringBuffer sb = new StringBuffer();
		int index = 0;
		int temp = number;
		int size = 0;
		while(temp >0 ) {
			size ++;
			temp = temp/10;
		}
		int a[] = new int [size];
		int i = 0;
		while(number >0 ) {
			a[i++] = number % 10;
			number = number /10;
		}
		int first = 0;
		int last = size-1;
		while(first < last) {
			int tempValue = a[last];
			a[last] = a[first];
			a[first] = tempValue;
			first ++;
			last --;
		}
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "1");
		map.put(2, "ABC");
		map.put(3, "DEF");
		map.put(4, "GIJ");
		map.put(5, "KLM");
		map.put(6, "NOP");
		map.put(7, "QRS");
		map.put(8, "TUV");
		map.put(9, "WXY");
		implementT9(a, sb, index, map);
	}
	
	public static void main(String args[]) {
		int number = 8662665;
		callerT9(number);
	}

}
