package ch19;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		// TODO Auto-generated method stub
		super.brewing();
		System.out.println("Adding Mocha syrup");
	}
	
	

}
