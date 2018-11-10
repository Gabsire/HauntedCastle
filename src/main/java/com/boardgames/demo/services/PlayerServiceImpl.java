package com.boardgames.demo.services;

import java.util.Random;

import com.boardgames.demo.entities.Player;

public class PlayerServiceImpl implements PlayerService{

	@Override
	public Integer rollDice() {
		Integer diceResult = (int) Math.round(Math.random()*2);
		return diceResult;
	}

	
	
}
