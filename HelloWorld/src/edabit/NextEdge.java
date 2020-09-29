package edabit;

public class NextEdge {

	public static void main(String[] args) {
		System.out.println(nextEdge(5,7));
	}
	public static int nextEdge(int a, int b) {
		int value=(a+b)-1;
		return value;
	}
}
