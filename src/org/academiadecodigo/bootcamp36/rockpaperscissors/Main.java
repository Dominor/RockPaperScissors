package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        RockPaperScissors game = new RockPaperScissors(player1, player2, 5);

        game.run();

    }
}
