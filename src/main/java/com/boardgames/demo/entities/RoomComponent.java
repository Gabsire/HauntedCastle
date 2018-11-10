package com.boardgames.demo.entities;

public class RoomComponent {

	private String name;
	private String description;
	private RoomComponentValue roomComponentValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RoomComponentValue getRoomComponentValue() {
		return roomComponentValue;
	}

	public void setRoomComponentValue(RoomComponentValue roomComponentValue) {
		this.roomComponentValue = roomComponentValue;
	}

	@Override
	public String toString() {
		return "RoomComponent [name=" + name + ", description=" + description + ", roomComponentValue="
				+ roomComponentValue + "]";
	}

}
