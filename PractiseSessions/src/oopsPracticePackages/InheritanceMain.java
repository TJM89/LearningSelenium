package oopsPracticePackages;

public class InheritanceMain {

	public static void main(String[] args) {

		InheritanceChild ICICI = new InheritanceChild();
		InheritanceChild2 Axis = new InheritanceChild2();

		ICICI.RBIRegulation1();
		ICICI.RBIRegulation2();
		ICICI.RBIRegulation3();                                        
		ICICI.ICICISpeicific();
		
		Axis.AxisBank();
		Axis.RBIRegulation1();
		Axis.RBIRegulation2();
		Axis.RBIRegulation3();

	}

}
