package edabit;

public class Equality {

	public static void main(String[] args) {
		System.out.println(equalityValues(5,5,5));
	}
	public static int equalityValues(int a,int b,int c) {
		if ((a == b) && (a == c)) {
			return 3;
		}
		else if (((a == b) && (a != c))||((a == c) && (a != b))) {
			return 2;
		}
		return 0;
	}

}
