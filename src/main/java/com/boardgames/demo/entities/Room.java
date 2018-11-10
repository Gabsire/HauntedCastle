package com.boardgames.demo.entities;

import java.util.Arrays;
import java.util.List;

public class Room {

	private String name;
	private String[] walls;
	private List<RoomComponent> roomComponents;
	private List<FloorValue> floorValues;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getWalls() {
		return walls;
	}

	public void setWalls(String[] walls) {
		this.walls = walls;
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
		return "Room [name=" + name + ", walls=" + Arrays.toString(walls) + ", roomComponents=" + roomComponents
				+ ", floorValues=" + floorValues + "]";
	}

}
