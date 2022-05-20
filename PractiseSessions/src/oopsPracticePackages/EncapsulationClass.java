package oopsPracticePackages;

public class EncapsulationClass {
	
	private String passportNumber = "F87458655";
	private String Name ="Thomas Jacob";
	private String Country = "India";
	
	public void personInfo() {
		
		System.out.println("The passport number is " + passportNumber);
		System.out.println("Name is " + Name);
		System.out.println("Passport validity is for 10 years");
		System.out.println("Country of citizenship is " + Country );
		
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	

	

}
