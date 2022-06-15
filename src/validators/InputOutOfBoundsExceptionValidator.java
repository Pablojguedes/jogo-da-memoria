package validators;

import exception.InputOutOfBoundsException;
import services.ValidationParametersService;

public class InputOutOfBoundsExceptionValidator extends Validator {

	@Override
	public void validate(String[] input) throws InputOutOfBoundsException {
		boolean exceptionCatched = false;
		int number = 0;
		
		try {
			number = Integer.parseInt(input[1]);
		}
		catch (NumberFormatException e) {
			exceptionCatched = true;
		}
		
		if((ValidationParametersService.containsTangentLetter(input[0]) ||
			number <= 0 ||
			number > 8) && !exceptionCatched)
			throw new InputOutOfBoundsException("Posição não contida no tabuleiro! Favor digitar outra:");
	}
}
