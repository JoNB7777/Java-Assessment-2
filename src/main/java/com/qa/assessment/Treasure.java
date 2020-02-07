package com.qa.assessment;

public class Treasure {
	private Long xCoordinate;
	private Long yCoordinate;
	
	public Treasure() {
		double randomXCoordinate = 100*Math.random();
		this.setxCoordinate(Double.doubleToLongBits(randomXCoordinate));
		double randomYCoordinate = 100 * Math.random();
		this.setyCoordinate(Double.doubleToLongBits(randomYCoordinate));
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

}
