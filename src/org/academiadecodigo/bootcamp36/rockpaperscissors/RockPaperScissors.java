package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class RockPaperScissors {

    private Player player1;
    private Player player2;
    private int maxNumberOfRounds;

    RockPaperScissors(Player player1, Player player2, int maxNumberOfRounds) {

        this.player1 = player1;
        this.player2 = player2;
        this.maxNumberOfRounds = maxNumberOfRounds;
    }

    /**
     * Plays a round
     */
    private void playRound(int i) {
        System.out.println("");
        System.out.println("----- Round " + i + " ------");
        HandShape player1Pick = player1.pick();
        HandShape player2Pick = player2.pick();
        System.out.println("Player 1 picked " + player1Pick + ". Player 2 picked " + player2Pick);
        if (player1Pick == player2Pick) {
            System.out.println("Tie!");
            return;
        }
        if (beats(player1Pick, player2Pick)) {
            System.out.println("Player 1 won this turn!");
            player1.win();
            return;
        }
        System.out.println("Player 2 won this turn!");
        player2.win();
    }

    private void displayResults() {
        System.out.println("");
        System.out.println("Player 1 Wins: " + player1.getVictories() + "\n" + "Player 2 Wins: " + player2.getVictories());
        System.out.println("");
        System.out.println("Game Over");
        if (player1.getVictories() > player2.getVictories()) {
            System.out.println("Player 1 won");
            return;
        }
        if (player2.getVictories() > player1.getVictories()) {
            System.out.println("Player 2 won");
            return;
        }
        System.out.println("Overall Tie");
    }

    /*
     * Starts the game
     */

    public void run() {

        for (int i = 1; i <= maxNumberOfRounds; i++) {

            playRound(i);

        }
        displayResults();
    }

    private boolean beats(HandShape shape1, HandShape shape2) {

        if (shape1.equals(shape2)) {
            return false;
        }
        if ((shape1.equals(HandShape.ROCK) && shape2.equals(HandShape.SCISSORS))
                || ((shape1.equals(HandShape.SCISSORS) && shape2.equals(HandShape.PAPER)))
                || ((shape1.equals(HandShape.PAPER) && shape2.equals(HandShape.ROCK)))) {
            return true;
        }
        return false;
    }
}
