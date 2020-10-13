package edabit;

public class StutteringFunction {

	public static void main(String[] args) {
		System.out.println(stutter("incredible"));
		int[] inputArray = new int[] {30,40,20,5};
		System.out.println(changeEnough(inputArray,12.55));
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
}
