package org.academiadecodigo.bootcamp36.rockpaperscissors;

public class Player {

    private HandShape choice;

    public HandShape pick() {

        int choice = Randomizer.getRandom(3);

        return HandShape.values()[choice];
    }
}
