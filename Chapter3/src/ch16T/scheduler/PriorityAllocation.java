package ch16T.scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {

		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {

		System.out.println("���õ��� ���� �������� �켱������ ����˴ϴ�.");
	}

}
