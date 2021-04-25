package ch04;

//customer class�� ������ �Ӽ� �ʿ�
// + 5% ���ʽ� ����Ʈ ����
// + ���� 10%
// + ��� ���� ����

public class VIPCustomer extends Customer {

	double salesRatio; // ������
	private int agentID; // ��� ���� ID
	
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
