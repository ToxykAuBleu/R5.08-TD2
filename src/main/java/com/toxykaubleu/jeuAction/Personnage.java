package com.toxykaubleu.jeuAction;

public class Personnage {

    public enum Orientation {
        NORD,
        EST,
        SUD,
        OUEST,
    }

    private Orientation orientation;
    public Personnage() {
        this.orientation = Orientation.NORD;
    }
    public Personnage(Orientation orientation) {
        this.orientation = orientation;
    }

    public Orientation tourner(int fois) {
        Integer mod = (this.orientation.ordinal() + fois) % 4;
        switch (mod) {
            case 0:
                this.orientation = Orientation.NORD;
                break;
            case 1:
                this.orientation = Orientation.EST;
                break;
            case 2:
                this.orientation = Orientation.SUD;
                break;
            case 3:
                this.orientation = Orientation.OUEST;
                break;
        }
        return this.orientation;
    }
}
