package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {

    public static void main(String[] args) {

        int[][] edges = new int[4][2];
        edges[0][0] = 0;
        edges[0][1] = 1;
        edges[1][0] = 1;
        edges[1][1] = 2;
        edges[2][0] = 2;
        edges[2][1] = 3;
        edges[3][0] = 3;
        edges[3][1] = 0;

        int vertex = 4;
        List<List<Integer>> adjList = getAdjacencyList(vertex, edges);
        for(int i = 0; i < adjList.size(); i++){
            System.out.print(i);
            System.out.print(" -> ");
            List<Integer> neighbours = adjList.get(i);
            for(int item: neighbours){
                System.out.print(item);
                System.out.print(",");
            }
            System.out.println();
        }
        int startVertex = 0;
        List<Integer> output = bfsTraersal(vertex, adjList, startVertex);
        System.out.println("BFS Traversal O/P: ");
        for(int out: output){
            System.out.println(out);
        }
    }

    private static List<Integer> bfsTraersal(int vertex, List<List<Integer>> adjList, int startVertex) {

        if (adjList == null || adjList.size() == 0){
            return new ArrayList<>();
        }

        List<Integer> bfsOutput = new ArrayList<>();
        boolean[] visited = new boolean[vertex];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while(!queue.isEmpty()){

            int currVertex = queue.remove();
            bfsOutput.add(currVertex);
            List<Integer> currVertexAdjList = adjList.get(currVertex);
            for (int neigbhour : currVertexAdjList){
                if(!visited[neigbhour]){
                    visited[neigbhour] = true;
                    queue.add(neigbhour);
                }
            }
        }
        return bfsOutput;
    }

    private static List<List<Integer>> getAdjacencyList(int vertex, int[][] edges){

        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < vertex; i++){
            adjList.add(new ArrayList<>());
        }

        for(int j = 0; j < edges.length; j++){
            adjList.get(edges[j][0]).add(edges[j][1]);
            adjList.get(edges[j][1]).add(edges[j][0]);
        }
        return adjList;
    }
}
