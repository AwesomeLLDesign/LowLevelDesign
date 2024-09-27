package DivideAndConquer.classes.Class2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RatInAMaze {

    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        maze[0][0] = 1;
        maze[0][1] = 0;
        maze[0][2] = 0;

        maze[1][0] = 1;
        maze[1][1] = 1;
        maze[1][2] = 1;

        maze[2][0] = 0;
        maze[2][1] = 0;
        maze[2][2] = 1;

        int[][] visited = new int[3][3];
        for(int i =0; i<3; i++) Arrays.fill(visited[i], 0);
        System.out.println("Min Steps to reach destination: " + reachDestination(maze, 0 , 0 , 2, 2, visited, 1, Integer.MAX_VALUE));
    }

    private static int reachDestination(int[][] maze, int curr_x, int curr_y, int dest_x, int dest_y, int[][] visited , int steps,int minSteps){

        // base case
        if(curr_x == dest_x && curr_y == dest_y){

            return steps++;
        }
        int[] row_shift = {1,0,-1,0};
        int[] col_shift = {0,1,0,-1};
        // processing

        for(int i =0; i< row_shift.length;i++){
            curr_x = curr_x+row_shift[i];
            curr_y = curr_y +col_shift[i];
            if(isSafe(maze,curr_x,curr_y,0,maze.length,0,maze[0].length,visited)){
                visited[curr_x][curr_y] = 1;
                minSteps = Math.min(minSteps,reachDestination(maze,curr_x,curr_y,dest_x,dest_y,visited,++steps, minSteps));

            }
        }

        return minSteps;
        // recursion

    }

    private static boolean isSafe(int[][] maze, int curr_x, int curr_y, int rowMin, int rowMax, int colMin, int colMax, int[][] visited){
        if(curr_x < rowMax && curr_x > rowMin && curr_y < colMax && curr_y > colMin && visited[curr_x][curr_y] == 0){
            return true;
        }
        return false;
    }

}
