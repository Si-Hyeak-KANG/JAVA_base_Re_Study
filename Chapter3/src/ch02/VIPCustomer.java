package ch02;

//customer class�� ������ �Ӽ� �ʿ�
// + 5% ���ʽ� ����Ʈ ����
// + ���� 10%
// + ��� ���� ����

public class VIPCustomer extends Customer {

	double salesRatio; // ������
	private int agentID; // ��� ���� ID
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		
		return agentID;
	}
}
