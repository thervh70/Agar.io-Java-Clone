package unit;

import game.Game;

/**
 * Created by Robin on 28-6-2015.
 */
public abstract class Unit {

    protected int x = 0,y = 0, totalMass = 1;
    protected Game game;

    /**
     * Class that defines a spawn action of a unit.
     */
    public void spawn() {
        int[] coords = game.getGrid().spawn(this.getClass());
        this.x = coords[0];
        this.y = coords[1];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[] getXY() {
        return new int[]{x,y};
    }

    public int getTotalMass() {
        return this.totalMass;
    }

    public Game getGame() {
        return this.game;
    }
}
