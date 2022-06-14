package validators;

import exception.InputOutOfBoundsException;

public class InputOutOfBoundsExceptionValidator extends Validator {

	@Override
	public void validate(String[] input) throws InputOutOfBoundsException {
		
		Integer number = Integer.parseInt(input[1]);
		
		if(ValidationParameters.containsTangentLetter(input[0]) ||
			number <= 0 ||
			number > 8)
			throw new InputOutOfBoundsException("Posição não contida no tabuleiro! Favor digitar outra");
	}
}
