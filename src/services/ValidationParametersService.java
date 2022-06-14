package services;

public class ValidationParametersService {
	
	private static final String[] VALID_LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H"};
	private static final String[] TANGENT_LETTERS = {"I", "J", "K", "L", "M"};
	private static final String[] VALID_NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8"};
	
	public static boolean containsLetter(String letter) {
		for(String currentLetter : VALID_LETTERS)
			if(letter.equals(currentLetter))
				return true;
		
		return false;
	}
	
	public static boolean containsNumber(String number) {
		for(String currentNumber : VALID_NUMBERS)
			if(number.equals(currentNumber))
				return true;
		
		return false;
	}
	
	public static boolean containsTangentLetter(String letter) {
		for(String currentLetter : TANGENT_LETTERS)
			if(currentLetter.equals(letter))
				return true;
		
		return false;
	}

}
