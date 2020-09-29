package edabit;

public class LeftDigit {
	public static void main(String[] args) {
		System.out.println(mostLeftDigit("TrAdE2W1n95!"));
	}
	public static int mostLeftDigit(String a){
		for(int i=0;i<a.length();i++) {
			if(((Character)a.charAt(i)).isDigit(a.charAt(i))) {
				return Integer.parseInt(a.charAt(i)+"");
			}
		}
		return 0;	
	}
	//or
	public static int leftDigit(String str) {
		for (char c : str.toCharArray()) {
				if (Character.isDigit(c)) 
					return Integer.parseInt(Character.toString(c));
		}
		return 0;		
}


}

