package flowers;

/**
 * Ready for GIT
 */
public enum FlowerColor {
    BLACK, RED, BLUE, PINK, GREEN;
    public String toString(){
        String a = "";
        switch(this){
            case GREEN: a = "Green"; break;
            case BLACK: a = "Black"; break;
            case RED: a = "Red"; break;
            case BLUE: a = "Blue"; break;
            case PINK: a = "Pink"; break;
        }
        return a;
    }
}
