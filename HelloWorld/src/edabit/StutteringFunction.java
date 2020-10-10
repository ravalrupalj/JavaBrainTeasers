package edabit;

public class StutteringFunction {

	public static void main(String[] args) {
		System.out.println(stutter("incredible"));

	}
	public static String stutter(String s) {
		String letter=s.substring(0,2);
		return letter+"... "+letter+"... "+s+"?";
	}

}
