package unit;

import game.Game;

/**
 * Created by Robin on 28-6-2015.
 */
public class Player extends Unit {

    /**
     * Constructor for a player.
     * It resets all the variables and spawn a player.
     * The basic mass of a player is 10.
     * @param game The game is needed to spawn a player in the right game.
     */
    public Player(Game game) {
        this.mass = 10;
        this.game = game;

        spawn();
    }

    /**
     *
     */

}
