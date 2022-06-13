package game;

import entities.Card;

public class Board {
	
	private final int NUMBER_OF_ROWS = 8;
	private final int NUMBER_OF_COLUMNS = 8;
	
	private Card[][] elements;
	private boolean[][] status; //false is default, true if flipped face up
	
	public Board() {
		elements = new Card[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
		status = new boolean[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
	}
	
	public void addElement(int positionX, int positionY, Card element) {
		elements[positionX][positionY] = element;
	}
	
	public Card getElement(int positionX, int positionY) {
		return elements[positionX][positionY];
	}
	
	public boolean getStatus(int positionX, int positionY) {
		return status[positionX][positionY];
	}
	
	public void setStatus(int positionX, int positionY, boolean status) {
		this.status[positionX][positionY] = status;
	}
}
