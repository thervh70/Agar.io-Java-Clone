package unit;

import game.Game;

import java.util.ArrayList;

/**
 * Created by Robin on 28-6-2015.
 */
public class Player {

    private int amountBalls, totalMass;
    private ArrayList<Ball> ballList;

    /**
     * Constructor for a player.
     * It resets all the variables and spawn a player.
     * The basic mass of a player is 10.
     * @param game The game is needed to spawn a player in the right game.
     */
    public Player(Game game) {
        this.totalMass = 10;
        this.amountBalls = 1;
        this.ballList = new ArrayList<>();

        Ball basicBall = new Ball(game, 10);
        ballList.add(basicBall);
    }

    /**
     * Method to calculate the new weight
     */
    public void split() {
        if (totalMass > 40) {
            for (Ball b : ballList) {
                Ball[] res  = b.split();
            }
        }
    }

    public int getTotalMass() {
        return totalMass;
    }
}
