package validators;

import exception.RepeatedPositionException;
import game.Board;

public class RepeatedPositionExceptionValidator extends Validator {
	
	@Override
	public void validate(String[] input) throws RepeatedPositionException {
		
	}
	
	public static void validateIfNotRepeated(int[] input, Board board) throws RepeatedPositionException {
		if(board.getElement(input[0], input[1]).isFlipped())
			throw new RepeatedPositionException("Essa carta já foi selecionada anteriormente! Favor escolher outra:");
	}
	
}