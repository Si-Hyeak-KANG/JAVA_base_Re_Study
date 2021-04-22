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
		
		System.out.println(subwayName + "의 승객 수는 " + passenger + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
