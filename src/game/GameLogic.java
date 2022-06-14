package game;

import java.io.IOException;

public interface GameLogic {
	
	public void start() throws IOException;
	
	public void play();
	
	public void finish();
}
