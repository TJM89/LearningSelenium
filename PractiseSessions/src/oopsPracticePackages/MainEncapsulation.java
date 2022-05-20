package oopsPracticePackages;

public class MainEncapsulation {

	public static void main(String[] args) {

		EncapsulationClass ec = new EncapsulationClass();
		
		EncapsulationClass ecc = new EncapsulationClass();
		
		ec.personInfo();
		
		
		System.out.println("Country name is " + ecc.getCountry());
		
	}

}
