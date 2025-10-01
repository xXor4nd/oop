// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid;

    private int countCharPerDirection(int row, int col, int dirRow, int dirCol, char ch) {
        int len = 1;
        row += dirRow;
        col += dirCol;
        while (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == ch) {
            ++len;
            row += dirRow;
            col += dirCol;
        }
        return len;
    }

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     *
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int minRow = Integer.MAX_VALUE, maxRow = -1;
        int minCol = Integer.MAX_VALUE, maxCol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ch) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        if (maxRow == -1) return 0; // không tìm thấy
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     *
     * @return number of + in grid
     */
    public int countPlus() {
        int res = 0;
        int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ' ') continue;

                int[] lengths = new int[4];
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    lengths[k] = countCharPerDirection(i, j, dir[k][0], dir[k][1], grid[i][j]);
                    if (lengths[k] < 2) {
                        flag = false;
                        break;
                    }
                }

                for (int k = 1; k < 4 && flag; k++) {
                    if (lengths[k] != lengths[0]) flag = false;
                }

                if (flag) ++res;
            }
        }
        return res;
    }

}
