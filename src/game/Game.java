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
    Boolean running, validPlay, matched;
    Scanner sc;
    int[] boardPosition, firstCardFacedUpPosition;
    
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
        
        	for(int play = 1; play <= 2; play++) {
        		printCurrentTurnPlayer();
	        	validPlay = false;
	        	matched = false;
	        	
	        	while(!validPlay) {
	        		String cardPosition = sc.nextLine();
	        		decode(cardPosition);
	        	}
	            
	        	flipCardFaceUp();
	        	if(play == 1)
	        		firstCardFacedUpPosition = boardPosition;
	        	else
	        		checkIfMatched();
	        	if(matched) {
	        		play = 0;
	        		System.out.println("Acertou! Você ganhou 1 nova jogada!");
	        	}
        	}
        	checkIfOver();
        	switchTurns();
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
    		boardPosition = DecoderService.decodePosition(position, board);
    	}
    	catch (Exception e) {
    		validPlay = false;
    		System.out.println(e.getMessage());
    	}
    }
    
    private void flipCardFaceUp() {
    	board.flipCardFaceUp(boardPosition[0], boardPosition[1]);
    }
    
    private void checkIfMatched() {
    	if(board.getElement(firstCardFacedUpPosition[0], firstCardFacedUpPosition[1])
			.equals(board.getElement(boardPosition[0], boardPosition[1]))) {
    		if(player1.isCurrentTurn())
    			player1.addScore(); 
    		else
    			player2.addScore();
    		matched = true;
    	}
    	
    	else {
    		board.flipCardFaceDown(firstCardFacedUpPosition[0], firstCardFacedUpPosition[1]);
    		board.flipCardFaceDown(boardPosition[0], boardPosition[1]);
    	}
    	
    }
    
    private void checkIfOver() {
    	if(board.isAllFacedUp())
    		running = false;
    }
    
    private void switchTurns() {
    	player1.changeTurn();
    	player2.changeTurn();
    }
    
    public Board getCurrentBoard() {
    	return board;
    }
    
    @Override
    public void finish() {
        // TODO Auto-generated method stub
        
    }
}