package ch16T.gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		SuperLevel sLevle = new SuperLevel();
		player.upgradeLevel(sLevle);
		player.play(3);
	}

}
