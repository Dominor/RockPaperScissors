package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class Player {

    public HandShape pick() {

        int choice = Randomizer.getRandom(3);

        switch(choice) {
            case 0:
                return HandShape.ROCK;
            case 1:
                return HandShape.SCISSORS;
            case 2:
                return HandShape.PAPER;
            default:
                return HandShape.ROCK;
        }
    }
}
