package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println(Employee.getSerialNum());
		Employee employeeLee = new Employee();
		
		employeeLee.setEmployeeName("�̼���");
		
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		System.out.println(employeeLee.getEmployeeId()); //1001
		System.out.println(employeeKim.getEmployeeId()); //1002
	}

}
