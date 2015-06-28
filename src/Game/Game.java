package game;

/**
 * Created by Robin on 28-6-2015.
 */
public class Game {

    private Grid grid;

    /**
     * A game is an object that contains a grid.
     */
    public Game() {
        this.grid = new Grid(10,10);
    }

    public Grid getGrid(){
        return grid;
    }
}
