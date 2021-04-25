package ch02;

//고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
//일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
public class Customer {

	protected int customerID; //protected : 외부 클래스는 접근이 불가능 하지만 하위클래스는 접근 가능
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}
