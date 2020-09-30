package edabit;

public class Juices {

	public static void main(String[] args) {
		System.out.println(getDrinkId("apple","500ml"));
		System.out.println(getDrinkId("passion fruit", "750ml"));
		System.out.println(getDrinkId("pineapple", "45ml"));
	}
	public static String getDrinkId(String flavor, String ml) {
		String newDrink="";
		String[] drink=flavor.split(" ");
		for (String i:drink) {
			newDrink+=i.substring(0, 3).toUpperCase();
		}
				//(flavor.substring(0, 3)).toUpperCase();
		String id=ml.replaceAll("[^0-9]", "");

		//newDrink=drink+id;
		
		
		return newDrink+id;
	}

}
