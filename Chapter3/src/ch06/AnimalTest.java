package ch06;

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
		animalList.add(eagle);
		animalList.add(tiger);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
