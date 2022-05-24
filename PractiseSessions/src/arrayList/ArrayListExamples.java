package arrayList;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		ArrayList<String> stringList = new ArrayList<String>();

		int[] arrayLists = new int[5];

		arrayList.add(12);
		arrayList.add(52);
		arrayList.add(23);
		arrayList.add(55);
		arrayList.add(82);
		arrayList.add(95);
		System.out.println(arrayList.toString());

		stringList.add("Thomas");
		stringList.add("Maeve");
		stringList.add("Gily");
		stringList.add("Abraam");

		arrayList.remove(3);
		System.out.println(arrayList.toString());

		System.out.println(arrayList.get(2));
		System.out.println(stringList.get(1));
		System.out.println(stringList.indexOf("Maeve"));

		System.out.println(stringList.contains("Abraam"));

	}

}
