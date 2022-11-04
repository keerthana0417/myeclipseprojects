package company;

public class EmployeeInfo extends CompanyInfo {
	public void employeeName() {
		System.out.println("Keerthana");
	}
	public void employeeRole() {
		System.out.println("Tester");
	
	}
	public void employeeId() {
		System.out.println("1548676");
	}
	public static void main(String[] args) {
		EmployeeInfo v = new EmployeeInfo();
		v.companyName();
		v.companyId();
		v.companyAddress();
		v.employeeName();
		v.employeeId();
		v.employeeRole();
	}
}
