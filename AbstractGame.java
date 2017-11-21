abstract class AbstractGame {
    // Abstract class with implementation for basic Pick 2 game, and game specific methods to be overriden
    public AbstractGame() {

    }
    // Define abstract methods to be overriden
    abstract void initialiseGame() throws Exception;

    // Pass generated random number to subclass to apply it to specific game
    abstract void makeRandomChoice(double randomChoice);

    // Get game-specific text from the game subclass
    abstract void getIntroText();

    // Skeleton for a 'Pick 2' game. Get help text, generate random number, make pick; twice.
    public void mainGame() throws Exception {
        RandomInterface r=new LinearCongruentialGenerator();

        for (int i=0; i<2; i++) {
            getIntroText();
            UserInput.getInput();
            double randomChoice = r.next();
            makeRandomChoice(randomChoice);
        }
    }

    // Declare winner, same as old implementation
    abstract void declareGameWinner();
}
