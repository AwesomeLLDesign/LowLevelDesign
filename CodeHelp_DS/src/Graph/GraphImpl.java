package Graph;
import java.util.*;

public class GraphImpl {

    private Map<String,List<String>> adjList;

    public GraphImpl(){
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
        // hybrid (java 7 + java 8)
        // for(String vertex: adjList.keySet()){
        //     System.out.print(vertex + " : [ ");
        //     adjList.get(vertex).stream().forEach(neighbour -> System.out.print(neighbour + " "));
        //     System.out.print("]");
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        // undirected Graph
        GraphImpl undirectedGraph = new GraphImpl();
        undirectedGraph.addEdge("A", "B", false);
        undirectedGraph.addEdge("A", "C", false);
        undirectedGraph.addEdge("B", "C", false);
        undirectedGraph.addEdge("C", "D", false);
        System.out.println("Adjacency list of Unndirected Graph: ");
        undirectedGraph.printGraph();

        //directed graph
        GraphImpl directedGraph = new GraphImpl();
        directedGraph.addEdge("A", "B", true);
        directedGraph.addEdge("A", "C", true);
        directedGraph.addEdge("B", "C", true);
        directedGraph.addEdge("C", "D", true);
        System.out.println("Adjacency list of Directed Graph: ");
        directedGraph.printGraph();
    }

}
