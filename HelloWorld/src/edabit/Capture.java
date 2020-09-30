package edabit;

public class Capture {

	public static void main(String[] args) {
		String[] input = new String[]{"A8","E8"};
		System.out.println(canCapture(input));
	}
	public static boolean canCapture(String[] rooks) {
		if ((rooks[0].charAt(0)==rooks[1].charAt(0)) || (rooks[0].charAt(1)==rooks[1].charAt(1))){
			return true;
		}
		else {
			return false;
		}
	}

}
