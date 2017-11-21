import java.io.*;
import java.util.*;

public class Game {
    // Init a game and run game methods
    public static void playGame(String game) throws Exception {
        // Request game from factory
        AbstractGame newGame = GameFactory.createNewGame(game);
        // Run game methods
        newGame.initialiseGame();
        newGame.mainGame();
        newGame.declareGameWinner();
    }
    // Main loop
    public static void main (String[] args) throws Exception {
        System.out.print("Card (c) or Die (d) game? ");
        String userChosenGame = UserInput.getInput();
        playGame(userChosenGame);
    }
}
