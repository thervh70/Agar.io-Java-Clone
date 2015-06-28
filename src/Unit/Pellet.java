package unit;

import game.Game;

/**
 * Created by Robin on 28-6-2015.
 */
public class Pellet extends Unit{

    /**
     * Constructor for a pellet.
     * The mass of a single pellet is 1.
     * @param game
     */
    public Pellet(Game game) {
        this.mass = 1;
        this.game = game;

        spawn();
    }
}
