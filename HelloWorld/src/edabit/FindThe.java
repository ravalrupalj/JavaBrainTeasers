package edabit;

import java.util.Arrays;

public class FindThe {

	public static void main(String[] args) {
		//System.out.println(bomb("There is a bOmB."));
		double[] result=new double[] {1,3,2,5,4};
		//System.out.println(minMax(result));
		System.out.println(calculateScores("ABCBACC"));
		String[] input=new String[] {"###","###","###"};
		System.out.println(countCharacters(input));
	}
	public static String bomb(String s) {
		String l=s.toLowerCase();
		System.out.println(l);
		if (s.contains("bomb")) {
			return "DUCK!";
		}
		return "Relax, there's no bomb.";
	}
	public static double[] minMax(double[] arr) {
		Arrays.sort(arr);
		double[] output=new double[2] ;
		output[0]=arr[0];
		output[1]=arr[arr.length-1];
		return output;
	}
	public static int[] calculateScores(String str) {
		int first=0;
		int second=0;
		int third=0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)=='A') {
				first=first+1;
			}
			else if(str.charAt(i)=='B') {
				second=second+1;
			}
			else {
				third=third+1;
			}
		}
		int[] input=new int[] {0,0,0};

		input[0]=first;
		input[1]=second;
		input[2]=third;
		return input;
	}
	public static int countCharacters(String[] str) {
		int count=0;
		for (String k:str) {
			count=count+k.length();
		}
		System.out.println(String.join("",str));
		return count;
	}
	public static int getBudgets(String s) {
		
	}

}
