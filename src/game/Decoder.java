package game;

import java.util.List;

import validators.Validator;
import validators.ValidatorList;

public class Decoder {
// B5, B e 5
	public static int[] decodePosition(String position) throws Exception {
		
		String[] arrPosition = position.split("");
		
		List<Validator> validatorList = ValidatorList.getValidatorsList();
		
		for(Validator validator : validatorList)
			validator.validate(arrPosition);
		
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
			
			arrDecodedPos[1] = Integer.parseInt(arrPosition[1]);
			
			return arrDecodedPos;
			
			}
		}
