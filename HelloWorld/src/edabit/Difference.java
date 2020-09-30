package edabit;

import java.util.Arrays;

public class Difference {

	public static void main(String[] args) {
		int[] obj=new int[] {10,4,1,4,-10,-50,32,21};
		System.out.println(differenceMaxMin(obj));
	}
	public static int differenceMaxMin(int[] arr) {
		Arrays.sort(arr);
		for(int k:arr) {
			System.out.println(k);
		}
		for(int i=0; i < arr.length; i++)
		{
		    System.out.println(arr[i]);
		}

		System.out.println(arr);
		return arr[arr.length-1]-arr[0];
		
	}

}
