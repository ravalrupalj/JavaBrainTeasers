package edabit;

import java.util.ArrayList;
import java.util.Arrays;


public class StutteringFunction {

	public static void main(String[] args) {
		//System.out.println(stutter("incredible"));
		int[] inputArray = new int[] {30,40,20,5};
		//System.out.println(changeEnough(inputArray,12.55));
		System.out.println(repeat("mice",5));
		System.out.println(getWord("seas","onal"));
		System.out.println(intWithinBounds(3, 1, 9));
		System.out.println(isEvenOrOdd(3));
		int[] input=new int[] {88,232,4,9721,555};
		System.out.println(Arrays.toString(filterByLength(input, 3)));
		int [] input1=new int[] {0,19,18973623};
		System.out.println(probe(input1));
	}
	public static String stutter(String s) {
		String letter=s.substring(0,2);
		return letter+"... "+letter+"... "+s+"?";
	}
	public static boolean changeEnough(int[] change,double num) {
		double sum=0;
		for (int i=0;i<change.length;i++) {
			if (i==0) {
				sum=sum+(change[i]*0.25);
			}
			else if (i==1) {
				sum=sum+(change[i]*0.10);
			}
			else if (i==2) {
				sum=sum+(change[i]*0.05);
			}
			else if (i==3) {
				sum=sum+(change[i]*0.01);
			}
		
		}
		System.out.println(sum);
		return sum>num;
		
	}
	public static String repeat(String s,int num) {
		String output="";
		for(int i =0; i< s.length(); i++) {
			int count = num;
			while(count > 0) {
				count--;
				output+= s.charAt(i);
			}
		}
		return output;
			
		
	}
	public static String getWord(String left, String right) {
		String str=left+right;
		String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
		return cap;
	}
	public static boolean intWithinBounds(int n, int lower, int upper) {
		for (int i=lower;i<upper;i++) {
			if (i==n) {
				return true;
			}
		}
		return false;
	}
    public static String isEvenOrOdd(int num) {
    	if (num%2==0) {
    		return "even";
    	}
    	else {
    		return "odd";
    	}
    }
    public static int[] filterByLength(int[] number,int len) {
    	int[] out = new int[number.length];
    	int index = 0;
    	for (int k:number) {
    		if (String.valueOf(k).length() == len) {
    			out[index] = k;
    			index += 1;
    		}
    	}
    	return Arrays.copyOfRange(out, 0, index);
    }
    public static int probe(int[] r) {
    	Arrays.sort(r);
    	for (int i=r.length-1;i>=0;i--) {
    		if (r[i]%2==0) {
    			return r[i];
    		}
    	}
    	return -1;
    }
}
