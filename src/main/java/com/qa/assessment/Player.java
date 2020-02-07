package com.qa.assessment;

public class Player {
	private Long xCoordinate;
	private Long yCoordinate;
	private boolean playerFoundTreasure;
	
	public Player() {
		double randomXCoordinate = 100 * Math.random();
		this.setxCoordinate(Double.doubleToLongBits(randomXCoordinate));
		double randomYCoordinate = 100 * Math.random();
		this.setyCoordinate(Double.doubleToLongBits(randomYCoordinate));
		this.setPlayerFoundTreasure(false);
		
	}
	
	public Long getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(Long xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public Long getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(Long yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public boolean isPlayerFoundTreasure() {
		return playerFoundTreasure;
	}

	public void setPlayerFoundTreasure(boolean playerFoundTreasure) {
		this.playerFoundTreasure = playerFoundTreasure;
	}
	
	

}
