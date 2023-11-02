package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class BoardTest {
    private static final int MAX_WIDTH = 1;
    private static final int MAX_HEIGHT = 1;
    private Square[][] grid = {
        { mock(Square.class)},
        { mock(Square.class)},
    };
    private final Board board = new Board(grid);

    /**
    This is a constructor test.
    **/
    @Test
    void testBoard() {
        final Square[][] grid = { { new BasicSquare() } };
        final Board board1 = new Board(grid);
        assertThat(board1.invariant()).isEqualTo(true);
    }

    /**
    This is a test for squareAt method.
    **/
    @Test
    void testSquareAt() {
        final Square[][] grid = { { new BasicSquare(), null } };
        final Board board1 = new Board(grid);
        board1.squareAt(0, 1);
    }
}
