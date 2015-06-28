package Game;

import Unit.Player;

/**
 * Created by Robin on 28-6-2015.
 */
public class Grid {
    private int width, heigth;

    /**
     * Generates a grid given the height and the width of the field.
     * @param width integer for width
     * @param height integer for height
     */
    public Grid(int width, int height){
        this.width = width;
        this.heigth = height;
    }

    /**
     * This method tries to find a nice spot for a unit to spawn.
     * @param u The object that will have to be spawned.
     * @return An array of integers containing a x and y coordinate.
     */
    public int[] spawn(Object u){
        if (u instanceof Player){
            return new int[]{0,0};
        }
        return new int[0];
    }

}
