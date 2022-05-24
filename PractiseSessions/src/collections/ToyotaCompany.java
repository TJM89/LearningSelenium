package collections;

public class ToyotaCompany {
	
	
	private String name;
	
	//composition
	ToyotaCanada toyotaCanada;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ToyotaCanada getToyotaCanada() {
		return toyotaCanada;
	}

	public void setToyotaCanada(ToyotaCanada toyotaCanada) {
		this.toyotaCanada = toyotaCanada;
	}
	
	

}
