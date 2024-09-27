package AlgoExpertProblems.Graph;

import java.util.*;

public class DFS {

    static class Graph {
        int V;
        LinkedList<Integer> children[];

        public Graph(int v) {
            this.V = v;
            children = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                children[i] = new LinkedList();
            }
        }

        public void addEdge(int p, int q) {
            children[p].add(q);
        }

        public void dfsUtil(int v, boolean[] visited) {
            visited[v] = true;
            System.out.println(v);

            Iterator<Integer> itr = children[v].iterator();
            while (itr.hasNext()) {
                int next = itr.next();
                if (!visited[next]) {
                    dfsUtil(next, visited);
                }
            }
        }

        public void depthFirstSearch(int v) {
            boolean[] visited = new boolean[V];
            Arrays.fill(visited, false);

            if (!visited[v]) {
                dfsUtil(v, visited);
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
        g.depthFirstSearch(2);
    }
}
