package services;

import java.util.ArrayList;
import java.util.List;

import validators.InputOutOfBoundsExceptionValidator;
import validators.InvalidInputExceptionValidator;
import validators.RepeatedPositionExceptionValidator;
import validators.Validator;

public class ValidatorListService {
	
	public static List<Validator> getValidatorsList(){
		
		List<Validator> validatorsList = new ArrayList<>(); 
		validatorsList.add(new InputOutOfBoundsExceptionValidator());
		validatorsList.add(new InvalidInputExceptionValidator());
		validatorsList.add(new RepeatedPositionExceptionValidator());
		
		return validatorsList;
	}
}
