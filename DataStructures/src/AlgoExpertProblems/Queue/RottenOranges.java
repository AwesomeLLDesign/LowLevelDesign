package AlgoExpertProblems.Queue;

import java.util.*;

public class RottenOranges {

    static class RottenOrangeLocation {
        int rowNo;
        int colNo;

        public RottenOrangeLocation(int i, int j) {
            this.rowNo = i;
            this.colNo = j;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 2}, {0, 1, 2}, {2, 1, 1}};       // output = 1;
//        int[][] grid = {{2, 2, 0, 1}};         // output = -1;
        int rows = grid.length;
        int columns = grid[0].length;
        System.out.println("The minimum unit of time required to rotten oranges  " + orangeRotting(grid, rows, columns));
    }

    private static boolean isValid(int currRow, int currColumn, int rows, int columns) {
        if (0 <= currRow && currRow < rows && 0 <= currColumn && currColumn < columns) {
            return true;
        }
        return false;
    }

    private static int orangeRotting(int[][] grid, int rows, int columns) {
        Queue<RottenOrangeLocation> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 2) {
                    RottenOrangeLocation orange = new RottenOrangeLocation(i, j);
                    q.add(orange);
                }
            }
        }
        q.add(null);
        int minUnitOfTime = minNumberOfDaysForRottingOranges(grid, rows, columns, q);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    minUnitOfTime = -1;
                    break;
                }
            }
        }
        return minUnitOfTime;
    }

    private static int minNumberOfDaysForRottingOranges(int[][] grid, int rows, int columns, Queue<RottenOrangeLocation> queue) {
        boolean atleastOneOrangeRotted = false;
        int minUnitOfTime = 0;
        while (!queue.isEmpty()) {
            RottenOrangeLocation orange = queue.poll();
            if (orange != null) {
                int x = orange.rowNo;
                int y = orange.colNo;
                if (isValid((x - 1), y, rows, columns) && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 2;
                    queue.add(new RottenOrangeLocation(x - 1, y));
                    atleastOneOrangeRotted = true;
                }
                if (isValid(x, (y - 1), rows, columns) && grid[x][y - 1] == 1) {
                    grid[x][y - 1] = 2;
                    queue.add(new RottenOrangeLocation(x, y - 1));
                    atleastOneOrangeRotted = true;
                }
                if (isValid((x + 1), y, rows, columns) && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 2;
                    queue.add(new RottenOrangeLocation(x + 1, y));
                    atleastOneOrangeRotted = true;
                }
                if (isValid(x, (y + 1), rows, columns) && grid[x][y + 1] == 1) {
                    grid[x][y + 1] = 2;
                    queue.add(new RottenOrangeLocation(x, y + 1));
                    atleastOneOrangeRotted = true;
                }
            } else {
                if (atleastOneOrangeRotted)
                    minUnitOfTime++;
                if (!queue.isEmpty()) {
                    queue.add(null);
                    atleastOneOrangeRotted = false;
                }
            }
        }
        return minUnitOfTime;
    }
}
