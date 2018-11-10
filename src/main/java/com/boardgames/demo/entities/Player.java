package com.boardgames.demo.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {

	private AtomicInteger id;
	private String name;
	private Character character;

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", character=" + character + "]";
	}

}
