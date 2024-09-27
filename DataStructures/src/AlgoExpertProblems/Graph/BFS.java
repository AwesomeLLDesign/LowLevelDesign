package AlgoExpertProblems.Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static class Graph {
        int V;      // number of vertices
        LinkedList adj[]; // adjacency list i.e. list of lists

        public Graph(int v) {
            this.V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList();
            }
        }

        public void addEdge(int startingVertex, int endingVertex) {
            adj[startingVertex].add(endingVertex);
        }

        public void bfs(int startVertex) {
            boolean[] visited = new boolean[V];
            Arrays.fill(visited, false);

            if (!visited[startVertex]) {
                bfsUtil(startVertex, visited);
            }
        }

        public void bfsUtil(int vertex, boolean[] visited) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(vertex);

            while (!queue.isEmpty()) {
                int v = queue.poll();
                if (!visited[v]) {
                    visited[v] = true;
                    System.out.println(v + " ");
                    Iterator<Integer> itr = adj[v].iterator();
                    while (itr.hasNext()) {
                        queue.add(itr.next());
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.bfs(2);
    }
}
