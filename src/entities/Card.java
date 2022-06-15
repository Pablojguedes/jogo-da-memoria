package entities;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "[" + name.charAt(0) + "]";
	}
}
