
package ch19T;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getinstance();
		
		Car sonata = factory.createCar();
		Car avante = factory.createCar();
		Car accent = factory.createCar();
		
		System.out.println(sonata.getCarNum());
		System.out.println(avante.getCarNum());
		System.out.println(accent.getCarNum());
		}	
}
