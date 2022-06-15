package game;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

import entities.CardNames;
import entities.Player;
import exception.InputOutOfBoundsException;
import exception.InvalidInputException;
import services.DecoderService;
import services.ShuffleService;

public class Game implements GameLogic{

    Player player1, player2;
    Board board;
    CardNames cardNames;
    Boolean running, validPlay;
    Scanner sc;
    
    @Override
    public void start() throws IOException {
        sc = new Scanner(System.in);
        initializePlayers();
        initializeBoard();
        shuffle();
        this.running = true;
    }

    private void initializePlayers() {
        SecureRandom random = new SecureRandom();
        int startingPlayer = 1 + random.nextInt(2);
        player1 = new Player(1, (startingPlayer == 1 ? true : false));
        player2 = new Player(2, !player1.isCurrentTurn());
    }
    
    private void initializeBoard() throws IOException {
        cardNames = new CardNames();
    	board = new Board(cardNames.getMatrixDimensions());
    }
    
    private void shuffle() {
    	ShuffleService.shuffle(board, cardNames.getNames());
    }
    
    public void testPrint() {
    	for(int i = 0; i < board.getRows(); i++) {
    		for(int j = 0; j < board.getColumns(); j++)
    			System.out.print(board.getElement(i, j));
    		System.out.println();
    	}
    }

    @Override
    public void play() {
        while(this.running == true) {
        	printCurrentTurnPlayer();
        	
        	validPlay = false;
        	while(!validPlay) {
        		String cardPosition = sc.nextLine();
        		decode(cardPosition);
        	}
            
        }
        
    }
    
    private void printCurrentTurnPlayer() {
    	System.out.printf("%s%s%n",
			(player1.isCurrentTurn() ? "Player 1" : "Player 2"),
			", favor inserir posição da carta (linha e coluna):");
    }
    
    private void decode(String position) {
    	validPlay = true;
    	try {
    		DecoderService.decodePosition(position);
    	}
    	catch (Exception e) {
    		validPlay = false;
    		System.out.println(e.getMessage());
    	}
    }
    
    @Override
    public void finish() {
        // TODO Auto-generated method stub
        
    }
}