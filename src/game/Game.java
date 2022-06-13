package game;

import java.security.SecureRandom;

import entities.Player;

public class Game implements GameLogic{

	Player player1, player2;
	Board board;
	
	@Override
	public void start() {
		initializePlayers();
		initializeBoard();
	}

	private void initializePlayers() {
		SecureRandom random = new SecureRandom();
		int startingPlayer = 1 + random.nextInt(2);
		player1 = new Player(1, (startingPlayer == 1 ? true : false));
		player2 = new Player(2, !player1.isCurrentTurn());
	}
	
	private void initializeBoard() {
		Board board = new Board();
		
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
