package edabit;

public class Challenge {

	public static void main(String[] args) {
		System.out.println(howManySeconds(10));
	}
	public static int howManySeconds(int hours) {
		int seconds=hours*60*60;
		return seconds;
	}
}
