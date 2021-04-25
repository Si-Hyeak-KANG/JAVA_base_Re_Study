package ch02;

//customer class와 동일한 속성 필요
// + 5% 보너스 포인트 적립
// + 할인 10%
// + 담당 상담원 존재

public class VIPCustomer extends Customer {

	double salesRatio; // 할인율
	private int agentID; // 담당 상담원 ID
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		
		return agentID;
	}
}
