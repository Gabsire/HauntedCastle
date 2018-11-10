package com.boardgames.demo.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {

	private AtomicInteger id;
	private String name;
	private Character character;

	public AtomicInteger getId() {
		return id;
	}

	public void setId(AtomicInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", character=" + character + "]";
	}

}
