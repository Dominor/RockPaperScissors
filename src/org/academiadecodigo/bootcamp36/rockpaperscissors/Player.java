package org.academiadecodigo.bootcamp36.rockpaperscissors;


public class Player {

    private int victories;

    Player() {
        this.victories = 0;
    }

    public int getVictories() {
        return victories;
    }

    public void win() {
        victories++;
    }

    public HandShape pick() {

        int choice = Randomizer.getRandom(HandShape.values().length);

        return HandShape.values()[choice];
    }
}
