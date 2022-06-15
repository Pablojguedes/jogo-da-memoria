package entities;

public class Player {
	
	private int tag;
	private boolean currentTurn;
	private int score;
	
	public Player(int tag, boolean currentTurn) {
		
		this.tag = tag;
		this.currentTurn = currentTurn;
		score = 0;
	}
	
	public int getScore() {
		return score;
	}

	public void addScore() {
		this.score++;
	}

	public int getTag() {
		return tag;
	}
	
	public void changeTurn() {
		this.currentTurn = !this.currentTurn;
	}
	
	public boolean isCurrentTurn() {
		return currentTurn;
	}
	
}
