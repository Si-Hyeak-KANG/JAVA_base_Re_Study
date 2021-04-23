package ch19T;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getinstance() {
		
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	public Car createCar() {
		
		return new Car();
	}
	
}
