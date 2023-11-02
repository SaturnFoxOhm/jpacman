package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
* Returns an Image object that can then be painted on the screen. 
* The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
* argument is a specifier that is relative to the url argument. 
* <p>
* This method always returns immediately, whether or not the 
* image exists. When this applet attempts to draw the image on
* the screen, the data will be loaded. The graphics primitives 
* that draw the image will incrementally paint on the screen. 
*
* @param  url  an absolute URL giving the base location of the image
* @param  name the location of the image, relative to the url argument
* @return      the image at the specified URL
* @see         Image
*/

class BoardTest {
    private static final int MAX_WIDTH = 1;
    private static final int MAX_HEIGHT = 1;
    private Square[][] grid = {
        { mock(Square.class)},
        { mock(Square.class)},
    };
    private final Board board = new Board(grid);
    @Test
    void testBoard() {
        final Square[][] grid = { { new BasicSquare() } };
        final Board board1 = new Board(grid);
        assertThat(board1.invariant()).isEqualTo(true);
    }

    @Test
    void testSquareAt() {
        final Square[][] grid = { { new BasicSquare(), null } };
        final Board board1 = new Board(grid);
        board1.squareAt(0, 1);
    }
}
