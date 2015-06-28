package unit;

import game.BoundaryException;
import game.Game;
import game.Grid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Robin on 28-6-2015.
 */
public class BallTest {

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
     * Testing the move function
     */
    @Test
    public void moveUpTest() throws BoundaryException {
        Ball ball = new Ball(game, 10);
        assertArrayEquals(basicCoords, ball.getXY());
        ball.move(1,1);
        assertArrayEquals(new int[]{2,2}, ball.getXY());
    }

    /**
     * Testing the move function with an exception.
     * @throws BoundaryException This exception is supposed to be thrown
     */
    @Test (expected=BoundaryException.class)
    public void moveExceptionTest() throws BoundaryException{
        Ball ball = new Ball(game, 10);
        assertArrayEquals(basicCoords, ball.getXY());
        ball.move(-2,-2);
    }

    /**
     * Testing the move function with an exception.
     * @throws BoundaryException This exception is supposed to be thrown
     */
    @Test (expected=BoundaryException.class)
    public void moveExceptionTest2() throws BoundaryException{
        Ball ball = new Ball(game, 10);
        assertArrayEquals(basicCoords, ball.getXY());
        ball.move(2,2);
    }
}
