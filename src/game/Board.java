package game;

import entities.Card;

public class Board {
	
	private final int NUMBER_OF_ROWS = 8;
	private final int NUMBER_OF_COLUMNS = 8;
	
	private Card[][] elements;
	
	public Board() {
		elements = new Card[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
	}
	
	public void addElement(int positionX, int positionY, Card element) {
		elements[positionX][positionY] = element;
	}
	
	public Card getElement(int positionX, int positionY) {
		return elements[positionX][positionY];
	}
	
	public int getRows() {
		return NUMBER_OF_ROWS;
	}
	
	public int getColumns() {
		return NUMBER_OF_COLUMNS;
	}
}
