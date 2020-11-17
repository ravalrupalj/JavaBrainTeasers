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
		
		Person personOne = new Person("Popu", 35, 5); 
		Person personTwo = new Person("Titu", 15, 10);
		Person personThree = new Person("Linky", 22, 8);
		Person[] allPersons = {personOne, personTwo, personThree};
		
		double ans = getBudgets(allPersons);
		System.out.print(ans);
		System.out.println(endCorona(487, 256, 23793));
		System.out.println(endCorona(3000,2000,50699));
		System.out.println(endCorona(30000, 25000, 390205));
		System.out.println(endCorona(
				260000, 255000, 20511691));
		int[] input1=new int[] {10,40,30,20,50};
		System.out.println(secondLargest(input1));
		int[] input2=new int[] {1,5,6};
		System.out.println(isAvgWhole(input2));
		int[] sum=new int[] {1,2,3};
		System.out.println(cumulativeSum(sum));
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
	public static String fizzBuzz(int n) {
		if (n%3==0 & n%5==0) {
			return "FizzBuzz";
		}
		else if (n%5==0) {
			return "Buzz";
		}
		else if (n%3==0) {
			return "Fizz";
		}
		else {
			return n+"";
		}
		
	}
	
	public static double getBudgets(Person[] persons) {
		double ans = 0;
		
		for(Person person:persons) {
			ans = ans + person.getBudget();
		}
		
		return ans;
	}
	public static int endCorona(int recovers, int newCases, int activeCases) {
		int remaining=recovers-newCases;
		double b=(double)remaining;
		double a= activeCases/b;
		System.out.println("a="+a);
		a = Math.ceil(a);
		return (int)a;
	}
	public static double discount(int price,int percentage) {
		return price-((price*percentage)/100);
	}
	public static int secondLargest(int[] num) {
		Arrays.sort(num);
		int result= num[num.length-2];
		return result;
	}
	public static boolean isAvgWhole(int[] arr) {
		int sum=0;
		for(int k:arr) {
			sum=sum+k;
		}
		double result=sum/(arr.length*1.0);
		if (result==(int)result) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static String joinPath(String portion1, String portion2) {
		String replaceString1=portion1.replaceAll("/","");
		String replaceString2=portion2.replaceAll("/","");
		return replaceString1+"/"+replaceString2;
	}
	public static int[] cumulativeSum(int[] nums) {
		int[] cumulative=new int[nums.length] ;
		int [] empty= new int[] {};
		int total=0;
		for(int i=0;i<nums.length;i++) {
			total=total+nums[i];
			cumulative[i]=total;
		}
		System.out.println(Arrays.toString(cumulative));

		return cumulative;
	}

}
