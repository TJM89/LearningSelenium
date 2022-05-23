package oopsPracticePackages;

public abstract class AbstractClass implements InterfaceClass{
	
	abstract void connection();
	abstract void data();
	
	
	//non concrete abstraction method
	public String someRandomInfo(String info) {
		System.out.println("Random data");
		return info;
	
	}
	
	@Override
	public void interfaceMethodSample() {

		System.out.println("Print sample");
		
	}
	
	@Override
	public void interfaceMethodSample2() {
		// TODO Auto-generated method stub
		
	}
	

}
