package ch19;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		//상위 클래스에 default constructor가 없어서 하위 클래스는 반드시 매개변수가 있는 super를 명시적으로 호출
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
	}
	
	

}
