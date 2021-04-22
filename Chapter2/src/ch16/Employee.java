package ch16;

public class Employee {

	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++; 
		employeeId = serialNum; // 기준값은 변화없이 생성자로 인스턴스 생성될 때마다 증가하는 스태틱 값을 멤버변수에 넣어줌.
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


	
	
}
