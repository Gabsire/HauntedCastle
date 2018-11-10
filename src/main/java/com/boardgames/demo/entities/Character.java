package com.boardgames.demo.entities;

public class Character {

	private String name;

	private Integer might;
	private Integer speed;
	private Integer sanity;
	private Integer intellect;

	private Integer startingMight;
	private Integer startingSpeed;
	private Integer startingSanity;
	private Integer startingIntellect;

	private Integer minMight;
	private Integer minSpeed;
	private Integer minSanity;
	private Integer minIntellect;

	private Integer maxMight;
	private Integer maxSpeed;
	private Integer maxSanity;
	private Integer maxIntellect;

	@Override
	public String toString() {
		return "Character [name=" + name + ", might=" + might + ", speed=" + speed + ", sanity=" + sanity
				+ ", intellect=" + intellect + ", startingMight=" + startingMight + ", startingSpeed=" + startingSpeed
				+ ", startingSanity=" + startingSanity + ", startingIntellect=" + startingIntellect + ", minMight="
				+ minMight + ", minSpeed=" + minSpeed + ", minSanity=" + minSanity + ", minIntellect=" + minIntellect
				+ ", maxMight=" + maxMight + ", maxSpeed=" + maxSpeed + ", maxSanity=" + maxSanity + ", maxIntellect="
				+ maxIntellect + "]";
	}

}
