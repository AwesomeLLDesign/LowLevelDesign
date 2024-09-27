package Graph;

import java.util.List;
import java.util.ArrayList;

public class CreatingAndPrintingGraph {

    public static void main(String[] args) {

        int vertex = 5;
        int[][] edges = new int[7][2];
        edges[0][0] = 0;
        edges[0][1] = 1;
        edges[1][0] = 0;
        edges[1][1] = 4;
        edges[2][0] = 4;
        edges[2][1] = 1;
        edges[3][0] = 4;
        edges[3][1] = 3;
        edges[4][0] = 1;
        edges[4][1] = 3;
        edges[5][0] = 1;
        edges[5][1] = 2;
        edges[6][0] = 3;
        edges[6][1] = 2;

        List<List<Integer>> result = printGraph(vertex, edges);
        int index = 0;
        for(List<Integer> list: result){
            System.out.print(index + " -> ");
            for (Integer num: list){
                System.out.print(num + ",");
            }
            index++;
            System.out.println();
        }

    }

    public static List<List<Integer>> printGraph(int vertex, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < vertex; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i =0; i < edges.length; i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        return adjList;
    }

}
