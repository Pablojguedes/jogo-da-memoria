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
	
	public void flipCardFaceUp(int positionX, int positionY) {
		elements[positionX][positionY].setFlipped(true);
	}
	
	public void flipCardFaceDown(int positionX, int positionY) {
		elements[positionX][positionY].setFlipped(true);
	}
	
	public boolean isAllFacedUp() {
		for(int i = 0; i < elements.length; i++)
			for(int j = 0; j < elements[i].length; j++)
				if(!elements[i][j].isFlipped())
					return false;
		return true;
	}
}
