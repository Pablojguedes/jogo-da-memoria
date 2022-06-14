package entities;

public class Card {
	
	private String name;
	private boolean isFlipped;
	
	public Card(String name) {
		this.name = name;
		isFlipped = false;
	}
	
	public String getName() {
		return name;
	}

	public boolean isFlipped() {
		return isFlipped;
	}

	public void setFlipped(boolean isFlipped) {
		this.isFlipped = isFlipped;
	}

	@Override
	public String toString() {
		return "[" + name.charAt(0) + "]";
	}
}
