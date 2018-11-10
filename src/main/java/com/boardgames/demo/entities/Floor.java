package com.boardgames.demo.entities;

public class Floor {

	FloorValue floorValue;

	public FloorValue getFloorValue() {
		return floorValue;
	}

	public void setFloorValue(FloorValue floorValue) {
		this.floorValue = floorValue;
	}

	@Override
	public String toString() {
		return "Floor [floorValue=" + floorValue + "]";
	}

}
