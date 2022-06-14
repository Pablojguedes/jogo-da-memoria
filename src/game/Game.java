package game;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

import entities.CardNames;
import entities.Player;
import services.ShuffleService;

public class Game implements GameLogic{

    Player player1, player2;
    Board board;
    CardNames cardNames;
    Boolean running;
    
    @Override
    public void start() throws IOException {
        Scanner sc = new Scanner(System.in);
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

    @Override
    public void play() {
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