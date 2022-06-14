package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardNames {
	
	private List<String> names = new ArrayList<>();
	private final String CARD_NAMES_URL = "C:\\Users\\Fastshop Papicu\\eclipse-workspace\\jogo-da-memoria\\Card Names";
	
	public CardNames() throws IOException {
		
		FileReader fileReader = new FileReader(CARD_NAMES_URL);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String nextLine = bufferedReader.readLine();
		
		while(nextLine != null) {
			this.names.add(nextLine);
			nextLine = bufferedReader.readLine();
		}
		
		bufferedReader.close();
	}
	
	public int getMatrixDimensions() {
		return (int) Math.sqrt(this.names.size() * 2);
	}
	
	public List<String> getNames(){
		return names;
	}
}