package validators;

import exception.InvalidInputException;

public class InvalidInputExceptionValidator extends Validator {
	
	@Override
	public void validate(String[] input) throws InvalidInputException {
		if(input.length != 2 || 
			!ValidationParameters.containsLetter(input[0]) || 
			!ValidationParameters.containsNumber(input[1]))
			throw new InvalidInputException("Entrada inválida! Favor inserir outra");
	}

}
