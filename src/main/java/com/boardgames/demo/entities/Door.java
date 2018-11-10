package com.boardgames.demo.entities;

public class Door extends RoomBorder{

	private Room nextRoom;

	@Override
	public String toString() {
		return "Door [nextRoom=" + nextRoom + "]";
	}

}
