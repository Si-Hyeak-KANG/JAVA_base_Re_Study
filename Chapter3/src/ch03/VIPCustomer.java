package ch03;

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
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	
	public int getAgentID() {
		
		return agentID;
	}
}
