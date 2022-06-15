import java.io.IOException;

import game.Game;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Game game = new Game();
		game.start();
		
		//game.testPrint();
		game.play();
	}	

}
