package ch19;

public class WhippingCream extends Decorator{

	public WhippingCream(Coffee coffee) {
		super(coffee);

		
	}

	@Override
	public void brewing() {
		// TODO Auto-generated method stub
		super.brewing();
		System.out.println("Adding Wipping Cream");
	}
	
	

}
