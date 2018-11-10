package com.boardgames.demo.entities;

import java.util.Arrays;
import java.util.List;

import com.boardgames.demo.enums.FloorValue;

public class Room {

	private String name;
	private RoomBorder[] roomBorders;
	private List<RoomComponent> roomComponents;
	private List<FloorValue> floorValues;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoomBorder[] getRoomBorders() {
		return roomBorders;
	}

	public void setRoomBorders(RoomBorder[] roomBorders) {
		this.roomBorders = roomBorders;
	}

	public List<RoomComponent> getRoomComponents() {
		return roomComponents;
	}

	public void setRoomComponents(List<RoomComponent> roomComponents) {
		this.roomComponents = roomComponents;
	}

	public List<FloorValue> getFloorValues() {
		return floorValues;
	}

	public void setFloorValues(List<FloorValue> floorValues) {
		this.floorValues = floorValues;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", roomBorders=" + Arrays.toString(roomBorders) + ", roomComponents="
				+ roomComponents + ", floorValues=" + floorValues + "]";
	}

}
