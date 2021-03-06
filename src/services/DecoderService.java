package services;

import java.util.List;

import game.Board;
import validators.RepeatedPositionExceptionValidator;
import validators.Validator;

public class DecoderService {
// B5, B e 5
	public static int[] decodePosition(String position, Board board) throws Exception {
		
		String[] arrPosition = position.split("");
		
		List<Validator> validatorList = ValidatorListService.getValidatorsList();
		
		for(Validator validator : validatorList)
			validator.validate(arrPosition);
		
		arrPosition[0] = arrPosition[0].toUpperCase();
		
		int[] arrDecodedPos = new int [2];
			switch(arrPosition[0]) {
			case "A":
				arrDecodedPos[0] = 0;
				break;
			case "B":
				arrDecodedPos[0] = 1;
				break;
			case "C":
				arrDecodedPos[0] = 2;
				break;
			case "D":
				arrDecodedPos[0] = 3;
				break;
			case "E":
				arrDecodedPos[0] = 4;
				break;
			case "F":
				arrDecodedPos[0] = 5;
				break;
			case "G":
				arrDecodedPos[0] = 6;
				break;
			case "H":
				arrDecodedPos[0] = 7;
				break;
			}
			
			arrDecodedPos[1] = Integer.parseInt(arrPosition[1]) - 1;
			
			RepeatedPositionExceptionValidator.validateIfNotRepeated(arrDecodedPos, board);
			
			return arrDecodedPos;
			
			}
		}
