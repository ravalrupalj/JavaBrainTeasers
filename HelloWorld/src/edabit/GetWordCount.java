package edabit;

public class GetWordCount {

	public static void main(String[] args) {
		System.out.println(countWords("Just an example here move along"));
		
	}
	public static int countWords(String a) {
		String[] str=a.split(" ");
		
		return str.length;
	}
}
/*int count = 0;
for (int i = 0; i < s.length(); i++)
{
  if (s.charAt(i) == ' ')
    count++;
}
return count + 1;
}*/
