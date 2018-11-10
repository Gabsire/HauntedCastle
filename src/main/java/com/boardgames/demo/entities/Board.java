package com.boardgames.demo.entities;

import java.util.Arrays;

public class Board {

	private Player[] players;
	private Floor[] floors;

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return "Board [players=" + Arrays.toString(players) + ", floors=" + Arrays.toString(floors) + "]";
	}

}
