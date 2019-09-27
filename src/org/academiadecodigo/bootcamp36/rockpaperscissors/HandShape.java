package org.academiadecodigo.bootcamp36.rockpaperscissors;

public enum HandShape {
    ROCK,
    SCISSORS,
    PAPER;

    @Override
    public String toString() {
        switch (this) {
            case ROCK:
                return "Rock";
            case PAPER:
                return "Paper";
            default:
                return "Scissors";
        }
    }
}
