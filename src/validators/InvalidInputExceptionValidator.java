package validators;

import exception.InvalidInputException;
import services.ValidationParametersService;

public class InvalidInputExceptionValidator extends Validator {
	
	@Override
	public void validate(String[] input) throws InvalidInputException {
		if(input.length != 2 || 
			!ValidationParametersService.containsLetter(input[0]) || 
			!ValidationParametersService.containsNumber(input[1]))
			throw new InvalidInputException("Entrada inválida! Favor inserir outra:");
	}

}
