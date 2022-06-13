package entities;

public class Player {
	
	private int tag;
	private boolean currentTurn;
	
	public Player(int tag, boolean currentTurn) {
		
		this.tag = tag;
		this.currentTurn = currentTurn;
	}
	
	public int getTag() {
		return tag;
	}
	
	public boolean isCurrentTurn() {
		return currentTurn;
	}
	
}
