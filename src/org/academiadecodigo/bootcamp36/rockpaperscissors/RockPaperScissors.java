package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class RockPaperScissors {

    public static void main(String args[]) {

        int maxNumberOfRounds = 5;
        int numberWinsPlayer1 = 0, numberWinsPlayer2 = 0;
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();

        for (int i = 1; i <= maxNumberOfRounds; i++) {

            System.out.println("");
            System.out.println("----- Round " + i + " ------");
            HandShape player1Pick = players[0].pick();
            HandShape player2Pick = players[1].pick();
            System.out.println("Player 1 picked " + player1Pick.getName() + ". Player 2 picked " + player2Pick.getName());
            if (player1Pick.beats(player2Pick)) {
                System.out.println("Player 1 won this turn!");
                numberWinsPlayer1++;
            }
            if (player2Pick.beats(player1Pick)) {
                System.out.println("Player 2 won this turn!");
                numberWinsPlayer2++;
            }
            if (player1Pick == player2Pick) {
                System.out.println("Tie!");
            }
        }
        System.out.println("");
        System.out.println("Game Over");
        if (numberWinsPlayer1 > numberWinsPlayer2) {
            System.out.println("Player 1 won");
            return;
        }
        if (numberWinsPlayer2 < numberWinsPlayer1) {
            System.out.println("Player 2 won");
            return;
        }
        System.out.println("Overall Tie");
    }
}
