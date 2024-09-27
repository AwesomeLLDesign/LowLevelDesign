package Graph;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvince {

    public static void main(String[] args) {

        int vertices = 10;
        int[][] edges = new int[8][2];
        edges[0][0] = 0;
        edges[0][1] = 1;
        edges[1][0] = 1;
        edges[1][1] = 2;
        edges[2][0] = 2;
        edges[2][1] = 3;
        edges[3][0] = 0;
        edges[3][1] = 3;
        edges[4][0] = 4;
        edges[4][1] = 5;
        edges[5][0] = 5;
        edges[5][1] = 6;
        edges[6][0] = 4;
        edges[6][1] = 6;
        edges[7][0] = 7;
        edges[7][1] = 8;

        List<List<Integer>> adjList = getAdjacencyList(vertices, edges);

        for(int i =0; i < adjList.size(); i++){
            System.out.print(i);
            System.out.print("->");
            for(int neighbour: adjList.get(i)){
                System.out.print(neighbour);
                System.out.print(",");
            }
            System.out.println();
        }
        boolean[] visited = new boolean[vertices];

        long provinceCount = countNumberOfProvince(vertices, adjList, visited);
        System.out.println("The number of province count is : " + provinceCount);

    }

    private static long countNumberOfProvince(int vertices, List<List<Integer>> adjList, boolean[] visited) {

        long pCount = 0;
        for(int i =0; i < vertices; i++){
            if(!visited[i]){
                visited[i] = true;
                pCount++;
                dfsTraversal(i,adjList,vertices, visited);
            }
        }
        return pCount;
    }

    private static void dfsTraversal(int i, List<List<Integer>> adjList, int vertices, boolean[] visited) {
        List<Integer> neighbours = adjList.get(i);
        for(int neighbour :  neighbours){
            if(!visited[neighbour]){
                visited[neighbour] = true;
                dfsTraversal(neighbour,adjList,vertices,visited);
            }
        }
    }

    private static List<List<Integer>> getAdjacencyList(int vertices, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i =0; i < vertices; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i =0; i < edges.length; i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        return adjList;
    }
}
