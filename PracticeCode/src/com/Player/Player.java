package com.Player;

public class Player {
	Integer score;
	String name;
	public Player(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
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
		return "Player [score=" + score + ", name=" + name + "]";
	}
	
	
	

}
