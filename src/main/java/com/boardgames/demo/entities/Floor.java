package com.boardgames.demo.entities;

import com.boardgames.demo.enums.FloorValue;

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
