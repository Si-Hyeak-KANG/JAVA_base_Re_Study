package ch14;

public class Student {

	String studentName;
	int money;
	String trans;
	
	public Student(String studentName, int money ) {

		this.studentName = studentName;
		this.money = money;
		
	}
	
	public void takeBus(Bus bus) {
		
		bus.take(1000);
		this.money -= 1000;
		this.trans = "������ ����";
	}
	
	public void takeSubway(Subway subway) {
		
		subway.take(1200);
		this.money -= 1200;
		this.trans = "����ö�� ����";
	}
	
	public void takeTaxi(Taxi taxi) {
		
		taxi.take(10000);
		this.money -= 10000;
		this.trans = "�ýø� ����";
	}
	
	public void showInfo() {
		
		System.out.println(studentName + "���� " +trans + " ���� ���� " + money + "�� �Դϴ�.");
		
	}
}
