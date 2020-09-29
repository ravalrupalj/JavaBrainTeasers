package edabit;

import java.util.Arrays;
import java.util.Collections;

public class TheName {

	public static void main(String[] args) {
		System.out.println(shuffleTheName("Donald Trump"));
	}
	public static String shuffleTheName(String s) {
		String[] k=s.split(" ");
		String sum="";
		//Collections.reverse(Arrays.asList(k));
		//System.out.println(Arrays.toString(k));
		//String out = String.join(" ", k);
		//System.out.println(out);
		
		for(int i=k.length-1;i>=0;i--) {
			sum=sum+k[i]+" ";
		}
		return sum.trim();
		
		
	}
}
