package studentExample;

public class StudentMainClass {

	public static void main(String[] args) {

		Student sd = new Student();

		double marksPercentage = 80;
		
		System.out.println("Student name is " + sd.getName());
		System.out.println("Student rollno is "+ sd.getRollno());
		System.out.println("Marks % is " + marksPercentage);
		
	}
}