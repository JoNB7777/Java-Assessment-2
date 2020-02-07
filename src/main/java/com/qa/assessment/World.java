package com.qa.assessment;

import com.qa.assessment.Utils;

public class World {
	private boolean playerFoundTreasure;
	private Long playerXCoordinate;
	private Long playerYCoordinate;
	private Long treasureXCoordinate;
	private Long treasureYCoordinate;
	

	public World() {
		setPlayerFoundTreasure(false);
		Player player = new Player();
		Treasure treasure = new Treasure();
		if (player.getxCoordinate() == treasure.getxCoordinate() && player.getyCoordinate() == treasure.getyCoordinate()) {
			setPlayerFoundTreasure(true);
		}
		if (playerFoundTreasure == false) {
			setPlayerXCoordinate(player.getxCoordinate());
			setPlayerYCoordinate(player.getyCoordinate());
			setTreasureXCoordinate(treasure.getxCoordinate());
			setTreasureYCoordinate(treasure.getyCoordinate());
			System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
						"reflected in the murky grey water which reaches up your shins.\r\n" + 
						"Some black plants barely poke out of the shallow water.\r\n" +  
						"You notice a small watch-like device in your left hand.  \r\n" + 
						"It has hands like a watch, but the hands don't seem to tell time.\r\n" + 
						"Press n to go north, w to go west, s to go south or e to go east.");
		}
	}

	
	public boolean isPlayerFoundTreasure() {
		return playerFoundTreasure;
	}

	public void setPlayerFoundTreasure(boolean playerFoundTreasure) {
		this.playerFoundTreasure = playerFoundTreasure;
	}
	
	public double calculatePlayerDistanceFromTreasure() {
		double distance = 1000;
		if (playerFoundTreasure == false) {
			double distanceSquared = (((getPlayerXCoordinate())^2)-(getTreasureXCoordinate())^2)
									+ (((getPlayerYCoordinate())^2)-(getTreasureYCoordinate())^2);
			distance = Math.sqrt(distanceSquared);
			if (distance == 0) {
				System.out.println("Congratulations you found the treasure!");
				setPlayerFoundTreasure(true);
			} else {
				System.out.println("Distance from treasure is: " + distance);
			}
			
		}
		return distance;
	}
	
	public String getPlayerDirectionForNextMove() {
		String playerDirection = "";
		System.out.println("Please enter the direction in which you want to go: ");
//		if (Utils.input().equalsIgnoreCase("n") || Utils.input().equalsIgnoreCase("w") ||
//				Utils.input().equalsIgnoreCase("e") || Utils.input().equalsIgnoreCase("s")) {
//			playerDirection = Utils.input().toLowerCase();
//			System.out.println(playerDirection);
//		} else {
//			throw new NoDirectionEnteredException();
//		}
//		}
		playerDirection = Utils.input();
		return playerDirection;
		
	}
	
	public void calculateNewPlayerPosition() {
		if (getPlayerDirectionForNextMove().equals("w")) {
			setPlayerXCoordinate(playerXCoordinate - 1);
		} else if (getPlayerDirectionForNextMove().equals("e")) {
			setPlayerXCoordinate(getPlayerXCoordinate() + 1);
		} else if (getPlayerDirectionForNextMove().contentEquals("n")) {
			setPlayerYCoordinate(playerYCoordinate + 1);
		} else if (getPlayerDirectionForNextMove().contentEquals("s")) {
			setPlayerYCoordinate(getPlayerYCoordinate() - 1);
		}
		
	}

	public Long getPlayerXCoordinate() {
		return playerXCoordinate;
	}

	public void setPlayerXCoordinate(Long playerXCoordinate) {
		this.playerXCoordinate = playerXCoordinate;
	}

	public Long getPlayerYCoordinate() {
		return playerYCoordinate;
	}

	public void setPlayerYCoordinate(Long playerYCoordinate) {
		this.playerYCoordinate = playerYCoordinate;
	}

	public Long getTreasureXCoordinate() {
		return treasureXCoordinate;
	}

	public void setTreasureXCoordinate(Long treasureXCoordinate) {
		this.treasureXCoordinate = treasureXCoordinate;
	}

	public Long getTreasureYCoordinate() {
		return treasureYCoordinate;
	}

	public void setTreasureYCoordinate(Long treasureYCoordinate) {
		this.treasureYCoordinate = treasureYCoordinate;
	}

	



	

}
