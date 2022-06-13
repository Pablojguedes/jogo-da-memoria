package entities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CardNames {
	
	private List<String> names = new ArrayList<>();
	private final String CARD_NAMES_URL = "C:\\Users\\Fastshop Papicu\\eclipse-workspace\\jogo-da-memoria\\Card Names";
	
	public CardNames(List<String> names) {
		
		FileReader fileReader = new FileReader(CARD_NAMES_URL);
		
	} 
}
