import utilities.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameForMe {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<>(Arrays.asList
                ("Train Game","Durak","Poker","Beer-pong","Darts","Drawing Game",
                        "Mario Monopoly","Beer Monopoly","Bags","Yahtzee",
                        "Sequence","Life"));

        int game = RandomNumberGenerator.getARandomNumber(0,games.size()-1);
        String g = games.get(game);
       // System.out.println(game);
        System.out.println("Our game will be " + g);
    }
}
