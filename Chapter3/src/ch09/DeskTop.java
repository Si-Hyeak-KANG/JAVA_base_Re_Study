package ch09;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
		
	}

	//turn off ¿Á¡§¿«
	@Override
	public void turnOff() {

		System.out.println("Desktop turnOff");
	}

}
