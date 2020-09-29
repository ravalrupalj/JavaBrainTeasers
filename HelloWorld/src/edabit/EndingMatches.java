package edabit;

public class EndingMatches {

	public static void main(String[] args) {
		System.out.println(checkEnding("hello","o"));
		System.out.println(checkEnding("abc", "d"));
	}
	public static boolean checkEnding(String str1,String str2) {
		int numberOFChar=str2.length();
		String lastCharOFstr1=str1.substring(str1.length()-numberOFChar);
		return lastCharOFstr1.equals(str2);
	}
}
