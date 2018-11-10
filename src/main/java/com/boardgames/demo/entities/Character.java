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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMight() {
		return might;
	}

	public void setMight(Integer might) {
		this.might = might;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getSanity() {
		return sanity;
	}

	public void setSanity(Integer sanity) {
		this.sanity = sanity;
	}

	public Integer getIntellect() {
		return intellect;
	}

	public void setIntellect(Integer intellect) {
		this.intellect = intellect;
	}

	public Integer getStartingMight() {
		return startingMight;
	}

	public void setStartingMight(Integer startingMight) {
		this.startingMight = startingMight;
	}

	public Integer getStartingSpeed() {
		return startingSpeed;
	}

	public void setStartingSpeed(Integer startingSpeed) {
		this.startingSpeed = startingSpeed;
	}

	public Integer getStartingSanity() {
		return startingSanity;
	}

	public void setStartingSanity(Integer startingSanity) {
		this.startingSanity = startingSanity;
	}

	public Integer getStartingIntellect() {
		return startingIntellect;
	}

	public void setStartingIntellect(Integer startingIntellect) {
		this.startingIntellect = startingIntellect;
	}

	public Integer getMinMight() {
		return minMight;
	}

	public void setMinMight(Integer minMight) {
		this.minMight = minMight;
	}

	public Integer getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(Integer minSpeed) {
		this.minSpeed = minSpeed;
	}

	public Integer getMinSanity() {
		return minSanity;
	}

	public void setMinSanity(Integer minSanity) {
		this.minSanity = minSanity;
	}

	public Integer getMinIntellect() {
		return minIntellect;
	}

	public void setMinIntellect(Integer minIntellect) {
		this.minIntellect = minIntellect;
	}

	public Integer getMaxMight() {
		return maxMight;
	}

	public void setMaxMight(Integer maxMight) {
		this.maxMight = maxMight;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getMaxSanity() {
		return maxSanity;
	}

	public void setMaxSanity(Integer maxSanity) {
		this.maxSanity = maxSanity;
	}

	public Integer getMaxIntellect() {
		return maxIntellect;
	}

	public void setMaxIntellect(Integer maxIntellect) {
		this.maxIntellect = maxIntellect;
	}

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
