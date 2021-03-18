package model;

import java.util.Random;

public class Coin {

    static boolean side;

    //MODIFIES this
    //EFFECTS Flips the coin randomly producing a boolean
    public void flip(){
        Random toss = new Random();
        side = toss.nextBoolean();

    }

    //REQUIRES data from flip()
    //EFFECTS returns "Heads" for true, and "Tails" for false
    public static String checkStatus(){
        if (side == true){return "Heads";}
        else return "Tails";
    }
}
