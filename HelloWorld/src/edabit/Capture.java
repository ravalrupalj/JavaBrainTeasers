package edabit;

import java.util.Arrays;
import java.util.Collections;


public class Capture {

	public static void main(String[] args) {
//		String[] input = new String[]{"A8","E8"};
//		System.out.println(canCapture(input));
//		int[] output=hashPlusCount("###+");
//		System.out.println(Arrays.toString(output));
//		int[] result=new int[] {1, 2, 10, 50, 5};
//		System.out.println(sortNumsAscending(result));	
//		boolean[] result1=new boolean[] {true,false,false,false,true};
//		System.out.println(result1);
//		System.out.println(primeNumberInRange(10, 15));
//		System.out.println(primeNumberInRange(62, 66));
//		System.out.println(primeNumberInRange(3, 5));
//		System.out.println(primeNumber(10, 15));
//		System.out.println(primeNumber(62, 66));
		System.out.println(primeNumber(0, 2));


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
	public static int[] sortNumsAscending(int[] nums){
		Arrays.sort(nums);
		String str =Arrays.toString(nums);
		int[] arr = Arrays.stream(str.substring(1, str.length()-1).split(","))
			    .map(String::trim).mapToInt(Integer::parseInt).toArray();
		//System.out.println(i);
		return arr;
		
	}
	public static int countType(boolean[] s) {
		int count=0;
		
		for(int i=0;i<s.length;i++) {
			if (s[i]==true){
				count=count+1;
			}
		}
		return count;
	}
	public static boolean primeNumberInRange(int n1, int n2) {
		if (n1==0 && n2==1){
			return false;
		}
		if (n1 ==0 || n1  ==1) {
			n1 = 2;
		}
		if (n1 == 2 || n1 == 3) {
			return true;
		}
		int start=n1-1;
		
		while (start<n2){
			start=start+1;
			int count=2;
			//System.out.println("Starting to divide "+start);
			while (count<start) {
				if (start%count==0 ){
					//System.out.println("divistion successful "+start+"%"+count);
					break;
				}	
				else if(start-1==count) {
					return true;
				}
			count+=1;
			}
			
		}	
		return false;	
	}
	public static boolean primeNumber(int n1, int n2) {
		while (n1<=n2) {
			if (n1==2) {
				return true;
			}
			for (int i=2;i<n1;i++) {
				if (n1%i==0||n1==0||n1==1) {
					break;
				}
				else if(n1%i!=0 & n1==i+1) {
					return true;
				}
			
			}
			
			n1=n1+1;
		
		}
		return false;
	}

	

}
