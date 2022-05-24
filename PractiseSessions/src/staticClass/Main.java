package staticClass;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println(Static.employeeIdChange);

		Random rndm = new Random();
		
		int val = rndm.nextInt();

		for (int i = 0; i <= 5; i++) {
			val = val + i;
			System.out.println("Random value " + val);
		}

	}

}
