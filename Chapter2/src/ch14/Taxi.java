package ch14;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		
		this.money += money;
		
	}
	
	public void showTaxiInfo() {
		
		System.out.println(taxiName + "�� ������ " + money + "�� �Դϴ�.");
	}
}
