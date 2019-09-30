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

    public void run() {

        int numberWinsPlayer1 = 0, numberWinsPlayer2 = 0;

        for (int i = 1; i <= maxNumberOfRounds; i++) {

            System.out.println("");
            System.out.println("----- Round " + i + " ------");
            HandShape player1Pick = player1.pick();
            HandShape player2Pick = player2.pick();
            System.out.println("Player 1 picked " + player1Pick + ". Player 2 picked " + player2Pick);
            if (player1Pick == player2Pick) {
                System.out.println("Tie!");
            } else if (beats(player1Pick, player2Pick)) {
                System.out.println("Player 1 won this turn!");
                numberWinsPlayer1++;
            } else {
                System.out.println("Player 2 won this turn!");
                numberWinsPlayer2++;
            }
        }

        System.out.println("");
        System.out.println("Player 1 Wins: " + numberWinsPlayer1 + ", " + "Player 2 Wins: " + numberWinsPlayer2);
        System.out.println("");
        System.out.println("Game Over");
        if (numberWinsPlayer1 > numberWinsPlayer2) {
            System.out.println("Player 1 won");
            return;
        }
        if (numberWinsPlayer2 > numberWinsPlayer1) {
            System.out.println("Player 2 won");
            return;
        }
        System.out.println("Overall Tie");
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
