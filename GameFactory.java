public class GameFactory {
    // Cleaner than strings, enum for gametype
    private enum GameType {
            d, c;
    }

    public static AbstractGame createNewGame(String userInput) {
        GameType userGameChoice = GameType.valueOf(userInput);
        // Take user input, return relevant game
        switch(userGameChoice) {
            case d:
                return new DieGame();
            case c:
                return new CardGame();
        }
        return new DieGame();
    }
}