package unit;

import org.junit.Before;
import org.junit.Test;
import game.Game;
import game.Grid;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Robin on 28-6-2015.
 */
public class PlayerTest {
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
        when(grid.spawn(Player.class)).thenReturn(basicCoords);
    }

    /**
     * Simple test to see whether the mass is initiated the right way.
     */
    @Test
    public void constructorMassTest() {
        Player player = new Player(game);
        assertEquals(10, player.getMass());
    }

    /**
     * Test to see whether the basic coordinates are loaded well.
     */
    @Test
    public void constructorCoordsTest() {
        Player player = new Player(game);
        assertArrayEquals(basicCoords,player.getXY());
    }

}
