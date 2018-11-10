package com.boardgames.demo.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Game {

	private AtomicInteger id;
	private Integer numberOfTurns;
	private Integer numberOfOmens;
	private Board board;

	private Game() {

	}

	public Game initializeGame() {
		Game game = new Game();
		game.setId(new AtomicInteger());
		game.setNumberOfTurns(0);
		game.setNumberOfOmens(0);
		Board board = new Board();
		return game;

	}

	public AtomicInteger getId() {
		return id;
	}

	public void setId(AtomicInteger id) {
		this.id = id;
	}

	public Integer getNumberOfTurns() {
		return numberOfTurns;
	}

	public void setNumberOfTurns(Integer numberOfTurns) {
		this.numberOfTurns = numberOfTurns;
	}

	public Integer getNumberOfOmens() {
		return numberOfOmens;
	}

	public void setNumberOfOmens(Integer numberOfOmens) {
		this.numberOfOmens = numberOfOmens;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", numberOfTurns=" + numberOfTurns + ", numberOfOmens=" + numberOfOmens + ", board="
				+ board + "]";
	}

}
