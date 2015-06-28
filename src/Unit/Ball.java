package unit;


import game.BoundaryException;
import game.Game;

/**
 * Created by Robin on 28-6-2015.
 */
public class Ball extends Unit{

    private int mass;

    /**
     * Constructor for a ball.
     * Multiple balls create a player.
     */
    public Ball(Game game, int mass) {
        this.game = game;
        this.mass = mass;

        spawn();
    }

    /**
     * Method that stores the new locations of a player.
     */
    public void move(int dx, int dy) throws BoundaryException {
        if (this.x + dx < 0 || this.x + dx > game.getGrid().getWidth()
                || this.y + dy < 0 || this.y + dx > game.getGrid().getHeigth()) {
            throw new BoundaryException();
        }

        this.x += dx;
        this.y += dy;
    }

    /**
     *
     */
    public Ball[] split() {
        //TODO: This will interfere with the spawn statement included in the constructor.
        Ball A = new Ball(this.game, this.mass / 2);
        Ball B = new
    }
}
