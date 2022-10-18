package com.Player;

public class PlayerTS {
	Integer score;
	String name;
	public PlayerTS(Integer score, String name) {
		super();
		this.score = score;
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PlayerTS [score=" + score + ", name=" + name + "]";
	}
	

}
