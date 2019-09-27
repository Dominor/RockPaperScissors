package org.academiadecodigo.bootcamp36.rockpaperscissors;

public enum HandShape {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private int code;

    HandShape(int code) {
        this.code = code;
    }

    boolean beats(HandShape shape) {
        if (this.code == 0 && shape.code == 1) {
            return true;
        }
        if (this.code == 1 && shape.code == 2) {
            return true;
        }
        if (this.code == 2 && shape.code == 0) {
            return true;
        }
        return false;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        switch (this.code) {
            case 0:
                return "Rock";
            case 1:
                return "Scissors";
            default:
                return "Paper";
        }
    }
}
