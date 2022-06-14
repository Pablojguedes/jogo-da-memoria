package game;

import java.security.SecureRandom;

import entities.Player;

import java.util.Scanner;

public class Game implements GameLogic{

	Player player1, player2;
	Board board;
	Boolean running;
	
	@Override
	public void start() {
		Scanner sc = new Scanner(System.in);
		initializePlayers();
		initializeBoard();
		this.running = true;
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
		start();
		while(this.running == true) {
			if (player1.isCurrentTurn() == true) {
				System.out.println("Player 1, favor inserir posição da carta (linha e coluna):");
				
			} else {
				System.out.println("Player 2, favor inserir posição da carta (linha e coluna):");
			}
		}
		
	}
	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
