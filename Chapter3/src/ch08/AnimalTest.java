package ch08;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");		
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {

		System.out.println("ȣ���̴� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���� �ٴմϴ�.");
	}
	
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(human);
		test.moveAnimal(tiger);
		test.moveAnimal(eagle);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(human);
		animalList.add(tiger);
		animalList.add(eagle);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0; i<list.size(); i++) {
			
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			
			if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			
			if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			
			else {
				System.out.println("unspported type");
			}
		}
		
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
