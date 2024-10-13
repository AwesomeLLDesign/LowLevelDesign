package Graph.Class1;
import java.util.*;
class Edge{

    String dest;
    int weight;

    Edge(String vertex, int weight){
        this.dest = vertex;
        this.weight = weight;
    }
}

public class WeightedGraphImpl {

private Map<String, List<Edge>> adjList;

    WeightedGraphImpl(){
        adjList = new HashMap<>();
    }

    public void addEdge(String source, String destination, int weight, boolean isDirected){
            adjList.putIfAbsent(source, new ArrayList<>());
            adjList.putIfAbsent(destination, new ArrayList<>());
            if(isDirected){
                adjList.get(source).add(new Edge(destination, weight));
            }else{
                adjList.get(source).add(new Edge(destination, weight));
                adjList.get(destination).add(new Edge(source, weight));
            }
    }

    public void printGraph(){
        Arrays.stream(adjList.keySet().toArray()).forEach(vertex -> {
            System.out.print(vertex + " : [");
            adjList.get(vertex).stream().forEach(edge -> System.out.print(" { " + edge.dest + " , " + edge.weight + " } "));
            System.out.print("]");
            System.out.println();
        });
    }

    public static void main(String[] args) {
        WeightedGraphImpl undirectedGraph = new WeightedGraphImpl();
        undirectedGraph.addEdge("A", "B", 2, false);
        undirectedGraph.addEdge("A", "C", 3, false);
        undirectedGraph.addEdge("B", "C", 1, false);
        undirectedGraph.addEdge("C", "D", 4, false);

        System.out.println("The Adjacency list for the undirected graph  is: ");
        undirectedGraph.printGraph();


        WeightedGraphImpl directedGraph = new WeightedGraphImpl();
        directedGraph.addEdge("A", "B", 2, true);
        directedGraph.addEdge("A", "C", 3, true);
        directedGraph.addEdge("B", "C", 1, true);
        directedGraph.addEdge("C", "D", 4, true);

        System.out.println("The Adjacency list for the directed graph  is: ");
        directedGraph.printGraph();

    }

}
