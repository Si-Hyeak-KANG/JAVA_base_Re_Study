package ch16T.gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("너무 빨라 보이지가 않습니다.");
	}

	@Override
	public void jump() {
		
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		
		System.out.println("turn을 합니다");
	}

	@Override
	public void showLevelMessage() {
		
		System.out.println("****** 고급자 레벨입니다.******");
	}
}
