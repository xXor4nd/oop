import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class TetrisGridTest {
	
	// Provided simple clearRows() test
	// width 2, height 3 grid
	@Test
	public void testClear1() {
		boolean[][] before =
		{	
			{true, true, false, },
			{false, true, true, }
		};
		
		boolean[][] after =
		{	
			{true, false, false},
			{false, true, false}
		};
		
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();

		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}

    @Test
    public void testNoFullRow() {
        boolean[][] grid = {
                {false, true,  false},
                {true,  false, false}
        };
        TetrisGrid tg = new TetrisGrid(grid);
        tg.clearRows();

        boolean[][] expected = {
                {false, true,  false},
                {true,  false, false}
        };
        assertArrayEquals(expected, tg.getGrid());
    }

    @Test
    public void testClearMultipleRows() {
        boolean[][] grid = {
                {true, true,  true},
                {true, true,  true}
        };
        TetrisGrid tg = new TetrisGrid(grid);
        tg.clearRows();

        boolean[][] expected = {
                {false, false, false},
                {false, false, false}
        };
        assertArrayEquals(expected, tg.getGrid());
    }
}
