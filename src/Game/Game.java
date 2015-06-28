package Game;

/**
 * Created by Robin on 28-6-2015.
 */
public class Game {

    private Grid grid;

    public Game() {
        this.grid = new Grid(10,10);
    }

    public Grid getGrid(){
        return grid;
    }
}
