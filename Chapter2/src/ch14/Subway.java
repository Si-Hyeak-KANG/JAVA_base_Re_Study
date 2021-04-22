package ch14;

public class Subway {

	String subwayName;
	int money;
	int passenger;
	
	public Subway(String subwayName) {
		
		this.subwayName = subwayName;
	}
	
	public void take(int money) {
		
		this.money -= money;
		passenger++;
	}
	
	public void showSubwayInfo() {
		
		System.out.println(subwayName + "�� �°� ���� " + passenger + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
}
