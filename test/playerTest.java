import Unit.Player;
import org.junit.Before;
import org.junit.Test;
import Game.Game;
import Game.Grid;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by Robin on 28-6-2015.
 */
public class playerTest {

    private Game game;
    private Grid grid;
    private int[] zeroCoords = new int[]{0, 0};

    @Before
    public void setUp() {
        game = mock(Game.class);
        grid = mock(Grid.class);

        when(game.getGrid()).thenReturn(grid);
        when(grid.spawn(Player.class)).thenReturn(zeroCoords);
    }

    @Test
    public void constructorMassTest() {
        Player player = new Player(game);
        assertEquals(10, player.getMass());
    }

    @Test
    public void constructorCoordsTest() {
        Player player = new Player(game);
        assertArrayEquals(zeroCoords,player.getXY());
    }

}
