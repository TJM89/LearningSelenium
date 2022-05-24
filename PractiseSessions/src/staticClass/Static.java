package staticClass;

public class Static {
	
	
	public static String employeeIdChange = "E4857748";
	
	public static String getEmployeeIdChange() {
		return employeeIdChange;
	}

	public static void setEmployeeIdChange(String employeeIdChange) {
		Static.employeeIdChange = employeeIdChange;
	}

	public String oldemployeeID;

	public String getOldemployeeID() {
		return oldemployeeID;
	}

	public void setOldemployeeID(String oldemployeeID) {
		this.oldemployeeID = oldemployeeID;
	}

}
