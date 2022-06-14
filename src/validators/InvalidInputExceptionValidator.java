package validators;

import exception.InvalidInputException;

public class InvalidInputExceptionValidator extends Validator {

	@Override
	public void validate(String[] input) throws InvalidInputException {
		if(input.length > 2)
	}

}
