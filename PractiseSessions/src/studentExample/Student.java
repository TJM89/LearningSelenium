package studentExample;

public class Student<string> {

	private String name = "Thomas";
	private int rollno = 16;
	private double marksPercentage;
	
	

	public String getName() {
		return name;	
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getMarksPercentage() {
		return marksPercentage;
	}

	public void setMarksPercentage(double marksPercentage) {
		this.marksPercentage = marksPercentage;
		
	}
		
	public boolean getInfo() {
		
		System.out.println("Name of student is " + this.name);
		System.out.println("Roll no is " + this.rollno);
		System.out.println("Percentage marks is " + marksPercentage);
			
		return true;
		
		
	}
	
	
	
}
