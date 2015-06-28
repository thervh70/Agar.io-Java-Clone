package unit;

import game.Game;
import game.Grid;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Robin on 28-6-2015.
 */
public class PelletTest {
    private Game game;
    private Grid grid;
    private int[] basicCoords = new int[]{1, 1};

    /**
     * This method sets up the mocks used in the different tests.
     */
    @Before
    public void setUp() {
        game = mock(Game.class);
        grid = mock(Grid.class);

        when(game.getGrid()).thenReturn(grid);
        when(grid.spawn(Pellet.class)).thenReturn(basicCoords);
    }

    @Test
    public void constructorMassTest() {
        Pellet pellet = new Pellet(game);
        assertEquals(1, pellet.getMass());
    }

    @Test
    public void constructorCoordsTest() {
        Pellet pellet = new Pellet(game);
        assertArrayEquals(basicCoords,pellet.getXY());
    }
}
