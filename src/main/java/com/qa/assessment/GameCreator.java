package com.qa.assessment;

public class GameCreator {
	private Boolean playerWantsToPlay;
	
	public GameCreator() {
		setPlayerWantsToPlay(true);
	}

	public Boolean getPlayerWantsToPlay() {
		return playerWantsToPlay;
	}

	public void setPlayerWantsToPlay(Boolean playerWantsToPlay) {
		this.playerWantsToPlay = playerWantsToPlay;
	}
	
	public void decideWhetherToCreateNewGame() {
		while (getPlayerWantsToPlay()) {
			World world = new World();
			while (world.isPlayerFoundTreasure() == false) {
				world.getPlayerDirectionForNextMove();
				world.calculateNewPlayerPosition();
				world.calculatePlayerDistanceFromTreasure();
			}
			System.out.println("Congratulations you found the treasure!");
			System.out.println("Do you still want to play? Please press y for yes or n for no.");
			if (Utils.input().equalsIgnoreCase("n")) {
				setPlayerWantsToPlay(false);
			}
		}
	}

}
