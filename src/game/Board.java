package game;

import entities.Card;

public class Board {
	
	private Card[][] elements;
	
	public Board(int matrixDimension) {
		elements = new Card[matrixDimension][matrixDimension];
	}
	
	public void addElement(int positionX, int positionY, Card element) {
		elements[positionX][positionY] = element;
	}
	
	public Card getElement(int positionX, int positionY) {
		return elements[positionX][positionY];
	}
	
	public int getRows() {
		return elements.length;
	}
	
	public int getColumns() {
		return elements[0].length;
	}
}
