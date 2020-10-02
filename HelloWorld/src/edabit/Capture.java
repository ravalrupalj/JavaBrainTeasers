package edabit;

import java.util.Arrays;

public class Capture {

	public static void main(String[] args) {
		String[] input = new String[]{"A8","E8"};
		System.out.println(canCapture(input));
		int[] output=hashPlusCount("###+");
		System.out.println(Arrays.toString(output));
	}
	public static boolean canCapture(String[] rooks) {
		if ((rooks[0].charAt(0)==rooks[1].charAt(0)) || (rooks[0].charAt(1)==rooks[1].charAt(1))){
			return true;
		}
		else {
			return false;
		}
	}
	public static int[] hashPlusCount(String s) {
		int count1=0;
		int count2=0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='#') {
				count1=count1+1;
			}
			if(s.charAt(i)=='+') {
				count2=count2+1;
			}
		}
		int[] obj=new int[] {count1 ,count2};
		return obj;
	
	}

}
