package game;

import unit.Pellet;
import unit.Player;

import java.util.ArrayList;
import unit.Unit;

/**
 * Created by Robin on 28-6-2015.
 */
public class Grid {
    private int width, heigth;
    private ArrayList<Unit> population;

    /**
     * Generates a grid given the height and the width of the field.
     * @param width integer for width
     * @param height integer for height
     */
    public Grid(int width, int height) {
        this.width = width;
        this.heigth = height;
    }

    /**
     * This method tries to find a nice spot for a unit to spawn.
     * @param o The object that will have to be spawned.
     * @return An array of integers containing a x and y coordinate.
     */
    public int[] spawn(Object o) {
        if (o instanceof Unit) {
            if (o instanceof Player) {
                population.add((Player) o);
                return new int[]{0, 1};
            }
            else if (o instanceof Pellet) {
                population.add((Pellet) o);
                return new int[]{20,20};
            }
        }
        return null;
    }

}
