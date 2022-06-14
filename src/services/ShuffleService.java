package services;

import java.security.SecureRandom;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entities.Card;
import game.Board;

public class ShuffleService {
	
	private static Set<Integer> positionsUsed = new TreeSet<>();
	
	public static void shuffle(Board board, List<String> names) {
		
		SecureRandom random = new SecureRandom();
		
		int position = random.nextInt(names.size() * 2);
		positionsUsed.add(position);
		
		for(int i = 0; i < names.size() * 2; i++) {
			if(i == names.size())
				i = 0;
		
			board.addElement(
				position / board.getRows(), 
				position % board.getColumns(), 
				new Card(names.get(i)));
			
			while(positionsUsed.contains(position))
				position = random.nextInt(names.size() * 2);
			
			positionsUsed.add(position);
		}	
	}
}
