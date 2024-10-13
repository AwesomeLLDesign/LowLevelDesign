package Graph.Class1;

import java.util.*;

public class DFSTraversal {

    private Map<String,List<String>> adjList;

    public DFSTraversal(){
        adjList = new HashMap<>();
    }

    private Map<String, List<String>> getAdjList() {
        return adjList;
    }   

    private void addEdge(String src, String dest, boolean direction){
            adjList.putIfAbsent(src,new ArrayList<>());
            adjList.putIfAbsent(dest,new ArrayList<>());
            if(direction){
                adjList.get(src).add(dest); // in the case of directed graph
            }else{
                adjList.get(src).add(dest); // in the case of undirected graph
                adjList.get(dest).add(src);
            }
    }

    private void printGraph(){
        // java 8 impl
        Arrays.stream(adjList.keySet().toArray()).forEach(vertex -> {
            System.out.print(vertex + " : [ ");
            adjList.get(vertex).stream().forEach(neighbour -> System.out.print(neighbour + " "));
            System.out.print("]");
            System.out.println();
        });
    }

    private List<String> dfsTraversalHelper(String source, Map<String,List<String>> adjList, Set<String> visited, List<String> output){

        
        if (source == null || source.isEmpty()) {
         return output;   
        }
            visited.add(source);
            output.add(source);
            adjList.get(source).stream().forEach( neighbour -> {
                if (!visited.contains(neighbour)) {
                    dfsTraversalHelper(neighbour, adjList, visited, output);
                }
            });

            return output;

    }


    public static void main(String[] args) {
        DFSTraversal undirectedGraph = new DFSTraversal();
        undirectedGraph.addEdge("A", "D", false);
        undirectedGraph.addEdge("D", "C", false);
        undirectedGraph.addEdge("C", "B", false);
        undirectedGraph.addEdge("B", "E", false);
        System.out.println("Adjacency list of Unndirected Graph: ");
        undirectedGraph.printGraph();
        System.out.println("The DFS Traversal for the undirected graph : ");
        Set<String> visited = new HashSet<>();
        List<String> out = new ArrayList<>();
        undirectedGraph.dfsTraversalHelper("A", undirectedGraph.getAdjList(), visited, out).stream().forEach(item -> System.out.print(item + " "));


        DFSTraversal directedGraph = new DFSTraversal();
        directedGraph.addEdge("A", "D", true);
        directedGraph.addEdge("D", "C", true);
        directedGraph.addEdge("C", "B", true);
        directedGraph.addEdge("B", "E", true);
        System.out.println("Adjacency list of Unndirected Graph: ");
        directedGraph.printGraph();
        System.out.println("The DFS Traversal for the directed graph : ");
        visited = new HashSet<>();
        out = new ArrayList<>();
        directedGraph.dfsTraversalHelper("A", directedGraph.getAdjList(), visited, out).stream().forEach(item -> System.out.print(item + " "));
    }

}
