package company;

public class SalaryDetails extends EmployeeInfo{
	public void employeeSalary() {
		System.out.println("Tester:50000");
	}
	public void employeeIncentive() {
		System.out.println("fun gifs");
	}
	public static void main(String[] args) {
		SalaryDetails s = new SalaryDetails();
		s.employeeName();
		s.employeeRole();
		s.companyName();
		s.employeeSalary();
		s.employeeId();
		s.employeeSalary();
		s.employeeIncentive();
		s.companyId();
		s.companyAddress();
		
	}
}
