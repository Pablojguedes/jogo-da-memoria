package validators;

import java.util.ArrayList;
import java.util.List;

public class ValidatorList {
	
	public static List<Validator> getValidatorsList(){
		List<Validator> validatorsList = new ArrayList<>(); 
		validatorsList.add(new InputOutOfBoundsExceptionValidator());
		validatorsList.add(new InvalidInputExceptionValidator());
		validatorsList.add(new RepeatedPositionExceptionValidator());
		
		return validatorsList;
	}
}
