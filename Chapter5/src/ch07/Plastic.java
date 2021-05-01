package ch07;

public class Plastic extends Material {

	public String toString() {
		return "재료는 plastic 입니다.";
	}

	@Override
	public void doPrinting() {

		System.out.println("plastic을 재료로 프린트를 시작합니다");
	}
}
