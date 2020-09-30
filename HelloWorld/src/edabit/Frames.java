package edabit;

import java.util.Arrays;

public class Frames {

	public static void main(String[] args) {
		//System.out.println(framesPerSecond(10,25));
		int[] inputArray = new int[] {3,4,5,6};
		
		//String asStr = Arrays.toString(inputArray);
		System.out.println(giveString(inputArray));
	}
	
	public static String giveString(int[] allIntegers) {
		String out = "[";
		
		for(int i=0; i<allIntegers.length; i++) {
			out = out+ allIntegers[i];
			if (i != allIntegers.length-1) {
				out += ",";
			}
		}
		out = out + "]";
		
		return out;
	}
	//public static String[] giveNewString(int[] allIntegers) {
		//String[] strArray1=new String[] {allIntegers.length};
		
		
		
		
	//	return ;
	//}

}
