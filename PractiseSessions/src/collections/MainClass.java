package collections;

public class MainClass {

	public static void main(String[] args) {

		ToyotaCompany tc = new ToyotaCompany();
		
		tc.setName("Mississauga");
		
		ToyotaCanada newbranch = new ToyotaCanada();
		
		tc.setToyotaCanada(newbranch);
		
		System.out.println("The new model of toyota in Canada is " + newbranch.getModel());
		
		
	}

}
