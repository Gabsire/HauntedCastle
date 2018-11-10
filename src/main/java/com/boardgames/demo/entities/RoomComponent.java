package com.boardgames.demo.entities;

public class RoomComponent {

	private String name;
	private String description;
	private RoomComponentValue roomComponentValue;

	@Override
	public String toString() {
		return "RoomComponent [name=" + name + ", description=" + description + ", roomComponentValue="
				+ roomComponentValue + "]";
	}

}
