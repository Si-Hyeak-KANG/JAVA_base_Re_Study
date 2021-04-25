package ch04;

//customer class와 동일한 속성 필요
// + 5% 보너스 포인트 적립
// + 할인 10%
// + 담당 상담원 존재

public class VIPCustomer extends Customer {

	double salesRatio; // 할인율
	private int agentID; // 담당 상담원 ID
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	@Override
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public int getAgentID() {
		
		return agentID;
	}
}
