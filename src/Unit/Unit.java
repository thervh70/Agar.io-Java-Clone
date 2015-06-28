package Unit;

import Game.Game;

/**
 * Created by Robin on 28-6-2015.
 */
public abstract class Unit {

    protected int x = 0,y = 0, mass = 1;
    protected Game game;

    /**
     * Abstract Class that defines a spawn action of a unit.
     */
    public abstract void spawn();

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[] getXY() {
        return new int[]{x,y};
    }

    public int getMass() {
        return this.mass;
    }

    public Game getGame() {
        return this.game;
    }
}
