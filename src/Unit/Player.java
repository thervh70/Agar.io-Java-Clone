package Unit;

import Game.Game;

/**
 * Created by Robin on 28-6-2015.
 */
public class Player extends Unit {

    @Override
    public void spawn() {
        int[] coords = game.getGrid().spawn(this.getClass());
        this.x = coords[0];
        this.y = coords[1];
    }

    public Player(Game game) {
        this.mass = 10;
        this.game = game;

        spawn();
    }

}
