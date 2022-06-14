package services;

import java.security.SecureRandom;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entities.Card;
import game.Board;

public class ShuffleService {
	
	public static void shuffle(Board board, List<String> names) {
		
		int index = 0;
		Set<Integer> positionsUsed = new TreeSet<>();
		SecureRandom random = new SecureRandom();
		
		int position = random.nextInt(names.size() * 2);
		positionsUsed.add(position);
		
		for(int i = 0; i < names.size() * 2; i++) {
			if(i < names.size())
				index = i;
			else
				index = i - names.size();
			
			board.addElement(
				position / board.getRows(), 
				position % board.getColumns(), 
				new Card(names.get(index)));
			
			if(i == names.size() * 2 - 1)
				break;
			
			while(positionsUsed.contains(position))
				position = random.nextInt(names.size() * 2);
			
			positionsUsed.add(position);
		}	
	}
}
