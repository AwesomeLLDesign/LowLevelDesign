package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {

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

        for(int i =0; i < adjList.size(); i++){
            System.out.print(i);
            System.out.print(" -> ");
            List<Integer> neighbours= adjList.get(i);
            for(int neighbour : neighbours){
                System.out.print(neighbour);
                System.out.print(",");
            }
            System.out.println();
        }

        boolean[] visited = new boolean[vertex];
        int startVertex = 0;
        visited[startVertex] = true;
        List<Integer> dfsOutput = new ArrayList<>();
        List<Integer> dfs = dfsTraversal(startVertex, visited, adjList, dfsOutput);
        for(int num: dfs){
            System.out.println(num);
        }

    }

    private static List<Integer> dfsTraversal(int startVertex, boolean[] visited, List<List<Integer>> adjList, List<Integer> dfsOutput){

        dfsOutput.add(startVertex);
        List<Integer> neighbours = adjList.get(startVertex);
        for(int neighbour: neighbours){
            if (!visited[neighbour]){
                visited[neighbour] = true;
                dfsTraversal(neighbour,visited,adjList, dfsOutput);
            }
        }

        return dfsOutput;
    }

    private static List<List<Integer>> getAdjacencyList(int vertex, int[][] edges){

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i =0; i < vertex; i++){
            adjList.add(new ArrayList<>());
        }

        for(int j =0; j < edges.length; j++){
            adjList.get(edges[j][0]).add(edges[j][1]);
            adjList.get(edges[j][1]).add(edges[j][0]);
        }

        return adjList;
    }
}
