package ch14;

public class Bus {

	int busNum;
	int money; // bus의 수입
	int passenger;
	
	public Bus(int busNum) {
		
		this.busNum = busNum;
	}
	
	public void take(int money) {
		
		this.money += money;
		passenger++;
	}
	
	public void showBusInfo() {
		
		System.out.println(busNum + "번의 승객 수는 " + passenger + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
}
