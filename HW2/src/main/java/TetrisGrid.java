//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean grid[][];
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
        int height = grid[0].length;
        int width = grid.length;

        for (int i = 0; i < height; i++) {
            boolean isFull = true;
            for  (int j = 0; j < width; j++) {
                if (!grid[j][i]) {
                    isFull = false;
                    break;
                }
            }
            if (isFull) {
                for (int j = i; j < height - 1; j++) {
                    for (int k = 0; k < width; k++) {
                        grid[k][j] = grid[k][j + 1];
                    }
                }
                for (int j = 0; j < width; j++) {
                    grid[j][height - 1] = false;
                }
                --i;
            }
        }
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
	}
}
