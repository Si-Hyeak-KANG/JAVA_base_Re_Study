package ch14;

public class TransTest {

	public static void main(String[] args) {

		Student james = new Student("James", 8000);
		Student danilo = new Student("Danilo", 10000);
		Student tomas = new Student("Tomas", 4000);
		Student pi = new Student("Pi", 3000);
		Student edward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		Subway greenSubway = new Subway("greenSubway");
		Subway redSubway = new Subway("redSubway");
		
		Taxi taxi1 = new Taxi("잘나간다 운수");
		
		james.takeBus(bus100);
		danilo.takeBus(bus200);
		
		tomas.takeSubway(greenSubway);
		
		pi.takeBus(bus200);
		
		edward.takeTaxi(taxi1);
		
		james.showInfo();
		danilo.showInfo();
		tomas.showInfo();
		pi.showInfo();
		edward.showInfo();
		
		bus100.showBusInfo();
		bus200.showBusInfo();
		
		greenSubway.showSubwayInfo();
		redSubway.showSubwayInfo();
		
		taxi1.showTaxiInfo();
		
		
	}

}
