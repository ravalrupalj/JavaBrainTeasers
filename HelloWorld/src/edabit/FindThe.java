package edabit;

public class FindThe {

	public static void main(String[] args) {
		System.out.println(bomb("There is a bomb"));
	}
	public static String bomb(String s) {
		String add=s.substring(0,s.length()).toLowerCase();
		String[] parts=add.split(" ");
		System.out.println(parts.toString());
		String test="";
		for (String k:parts) {
			if (k=="bomb") {
				test="DUCK";
				break;
			}
		}
		return test;
	}

}
