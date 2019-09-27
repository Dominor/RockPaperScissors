package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class RockPaperScissors {

    public static void main(String args[]) {

        int maxNumberOfRounds = 5;
        Player[] players = new Player[2];

        for (int i = 1; i <= maxNumberOfRounds; i++) {

            System.out.println("----- Round " + i + " ------");
            HandShape player1Pick = players[0].pick();
            HandShape player2Pick = players[1].pick();
            System.out.println("Player 1 picked " + player1Pick.getName() + ". Player 2 picked " + player2Pick.getName());
            if (player1Pick.beats(player2Pick)) {
                System.out.println("Player 1 won this turn!");
                return;
            }
            if (player2Pick.beats(player1Pick)) {
                System.out.println("Player 2 won this turn!");
                return;
            }
            if (player1Pick == player2Pick) {
                System.out.println("Tie!");
            }
        }

    }
}
