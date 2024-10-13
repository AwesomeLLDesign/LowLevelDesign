package Graph.Class1;

import java.util.*;

public class BFSTraversal {

private Map<String,List<String>> adjList;

        public BFSTraversal(){
        adjList = new HashMap<>();
    }

    public Map<String, List<String>> getAdjList() {
        return adjList;
    }   

    public void addEdge(String src, String dest, boolean direction){
            adjList.putIfAbsent(src,new ArrayList<>());
            adjList.putIfAbsent(dest,new ArrayList<>());
            if(direction){
                adjList.get(src).add(dest); // in the case of directed graph
            }else{
                adjList.get(src).add(dest); // in the case of undirected graph
                adjList.get(dest).add(src);
            }
    }

    public void printGraph(){
        // java 8 impl
        Arrays.stream(adjList.keySet().toArray()).forEach(vertex -> {
            System.out.print(vertex + " : [ ");
            adjList.get(vertex).stream().forEach(neighbour -> System.out.print(neighbour + " "));
            System.out.print("]");
            System.out.println();
        });
    }

    private List<String> bfsTraversalHelper(String source, Map<String, List<String>> adjList){

        List<String> output = new ArrayList<>();
        if (source == null || source.isEmpty()) {
            return output;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> bfsQueue = new LinkedList<>();

        bfsQueue.add(source);
        visited.add(source);
        output.add(source);

        while (!bfsQueue.isEmpty()) {
            String currVertex = bfsQueue.poll();
            adjList.get(currVertex).stream().forEach(neigbour -> {
                if (!visited.contains(neigbour)) {
                    bfsQueue.add(neigbour);
                    visited.add(neigbour);
                    output.add(neigbour);
                }
            });
        }
            return output;
    }

    public static void main(String[] args) {
                // undirected Graph
                BFSTraversal undirectedGraph = new BFSTraversal();
                undirectedGraph.addEdge("A", "B", false);
                undirectedGraph.addEdge("A", "C", false);
                undirectedGraph.addEdge("B", "C", false);
                undirectedGraph.addEdge("C", "D", false);
                System.out.println("Adjacency list of Unndirected Graph: ");
                undirectedGraph.printGraph();

                System.out.println("The bfs traversal for undirected graph: ");
                undirectedGraph.bfsTraversalHelper("A", undirectedGraph.getAdjList()).stream().forEach(item -> System.out.print(item + " "));
                BFSTraversal directedGraph = new BFSTraversal();
                directedGraph.addEdge("A", "B", true);
                directedGraph.addEdge("A", "C", true);
                directedGraph.addEdge("B", "C", true);
                directedGraph.addEdge("C", "D", true);
                System.out.println("Adjacency list of Directed Graph: ");
                directedGraph.printGraph();

                System.out.println("The bfs traversal for undirected graph: ");
                undirectedGraph.bfsTraversalHelper("A", directedGraph.getAdjList()).stream().forEach(item -> System.out.print(item + " "));
    }

}
