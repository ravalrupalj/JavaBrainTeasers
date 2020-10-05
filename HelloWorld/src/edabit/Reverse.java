package edabit;

import java.util.stream.IntStream;

public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverseTheString("Hello World"));
		System.out.println(doubleChar("String"));
		System.out.println(countVowels("Celebration"));
		System.out.println(getXO("ooxx"));
		System.out.println(getXO("ooxXm"));
		System.out.println(programmers(147,33,526));
		int[] input=new int[] {1,2,3,4,5,6,7,8,9,0};
		System.out.println(formatPhoneNumber(input));
		System.out.println(solveForExp(4,1024));
		System.out.println(doubleLetters("loop"));
		System.out.println(doubleLetters("forestry"));

	}
	public static String reverseTheString(String s) {
		String newString="";
		for (int i=s.length()-1;i>=0;i--) {
			newString+=s.charAt(i);
		}
		return newString;
	}
	public static String doubleChar(String s) {
		String newString="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			newString=newString+c+c;
			
		}
		return newString;
	}
	public static int countVowels(String s) {
		String newString=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if (newString.charAt(i)=='a'||newString.charAt(i)=='e'||newString.charAt(i)=='i'||newString.charAt(i)=='o'||newString.charAt(i)=='u') {
				count=count+1;
			}
		}
		return count;
	}
	public static boolean getXO(String s) {
		int count1=0;
		int count2=0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='o' || s.charAt(i) == 'O') {
				count1=count1+1;
			} else if (s.charAt(i)=='x' || s.charAt(i) == 'X') {
				count2=count2+1;
			}
			
		}
		System.out.println(count1+" "+count2);
		return (count1==count2);
		//return true;
		
	}
	public static int programmers(int a,int b,int c) {
		int max=IntStream.of(a,b,c).max().getAsInt();
		int min=IntStream.of(a,b,c).min().getAsInt();
		return max-min;
	}
	public static String formatPhoneNumber(int[] nums) {
		String s="(";
		for (int i:nums) {
			if (s.length()==4) {
				s=s+") ";
				s=s+i;
			}else if (s.length()==9) {
				s=s+"-";
				s=s+i;
			 }else {
				 s=s+i;
			 }
		}	
		return s;
		
	}
	public static int solveForExp(int a,int b) {
		int i=1;
		int mul=a;
		while(mul<b) {
			mul=mul*a;
			i=i+1;
		}
		return i;
	}
	public static boolean doubleLetters(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if ((s.charAt(i))==(s.charAt(i+1))){
				return true;
			}
		}
		return false;
	}

}
