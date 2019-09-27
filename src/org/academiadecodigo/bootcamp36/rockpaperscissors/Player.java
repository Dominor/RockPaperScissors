package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class Player {

    public HandShape pick() {

        int choice = Randomizer.getRandom(3);

        switch(choice) {
            case 0:
                return HandShape.ROCK;
            case 1:
                return HandShape.SCISSORS;
            default:
                return HandShape.PAPER;
        }
    }
}
