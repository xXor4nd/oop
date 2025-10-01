// Test cases for CharGrid -- a few basic tests are provided.

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CharGridTest {
	@Test
	public void testCharArea1() {
		char[][] grid = new char[][] {
				{'a', 'y', ' '},
				{'x', 'a', 'z'},
			};

		CharGrid cg = new CharGrid(grid);
				
		assertEquals(4, cg.charArea('a'));
		assertEquals(1, cg.charArea('z'));
	}
	
	@Test
	public void testCharArea2() {
		char[][] grid = new char[][] {
				{'c', 'a', ' '},
				{'b', ' ', 'b'},
				{' ', ' ', 'a'}
			};
		
		CharGrid cg = new CharGrid(grid);
		
		assertEquals(6, cg.charArea('a'));
		assertEquals(3, cg.charArea('b'));
		assertEquals(1, cg.charArea('c'));
	}

    @Test
    public void testCountPlus() {
        char[][] grid = {
                {' ', ' ', 'p', ' ', ' ', ' ', ' '},
                {' ', ' ', 'p', ' ', 'x', ' ', ' '},
                {'p', 'p', 'p', 'p', 'p', ' ', 'x'},
                {' ', ' ', 'p', ' ', 'y', 'y', 'x'},
                {' ', ' ', 'p', ' ', 'y', 'y', 'y'},
                {'z', 'z', 'z', 'z', 'z', 'y', 'z'},
                {' ', ' ', 'x', 'x', ' ', ' ', ' '}
        };
        CharGrid cg = new CharGrid(grid);
        assertEquals(2, cg.countPlus());
    }
}
