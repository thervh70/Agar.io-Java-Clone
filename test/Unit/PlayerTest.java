package unit;

import game.Game;
import game.Grid;
import javafx.scene.paint.Color;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
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
        when(grid.spawn(Ball.class)).thenReturn(basicCoords);
        when(grid.getWidth()).thenReturn(2);
        when(grid.getHeigth()).thenReturn(2);
    }

    /**
     * Simple test to see whether the mass is initiated the right way.
     */
    @Test
    public void constructorMassTest() {
        Player player = new Player(game, "alpha", Color.BLACK);
        assertEquals(10, player.getTotalMass());
    }
}
