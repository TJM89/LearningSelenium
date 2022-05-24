package stringExamples;

public class StringClass {

	public static void main(String[] args) {

		String[] citynames = { "Toronto", "Calgary", "Edmonton", "Kingston", "Ottawa", "Carlton" };

		int counter = 0;
		for (int i = 0; i < citynames.length; i++) {

			if (citynames[i].contains("on")) {
				counter++;

			}

		}
		System.out.println("city names with on are - " + counter);

	
	
	String name = "thomas";
	System.out.println(name.toUpperCase());
 
	}

}
