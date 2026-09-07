import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph {

    




























    // private int numVertices;
    // private boolean directed;
    // private List<List<Edge>> adjList;

    // public AdjacencyListGraph(int numVertices, boolean directed) {
    //     this.numVertices = numVertices;
    //     this.directed = directed;
    //     this.adjList = new ArrayList<>();
    //     for (int i = 0; i < numVertices; i++) {
    //         this.adjList.add(new ArrayList<>());
    //     }
    // }

    // public int getNumVertices() {
    //     return numVertices;
    // }

    // public List<List<Edge>> getAdjList() {
    //     return adjList;
    // }

    // public void addEdge(int u, int v, int weight) {
    //     adjList.get(u).add(new Edge(v, weight));

    //     if (!directed) {
    //         adjList.get(v).add(new Edge(u, weight));
    //     }
    // }

    // public int findMaxWeightSumVertexUndirected() {
    //     int maxVertex = -1;
    //     int maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i < numVertices; i++) {
    //         int sum = 0;
    //         List<Edge> edges = adjList.get(i);
    //         for (int j = 0; j < edges.size(); j++) {
    //             sum += edges.get(j).weight;
    //         }
    //         if (sum > maxSum) {
    //             maxSum = sum;
    //             maxVertex = i;
    //         }
    //     }

    //     System.out.println("[List] Vertex with max weight sum = " + (maxVertex + 1) + "  (sum = " + maxSum + ")");
    //     return maxVertex;
    // }

    // public int findMaxOutDegreeVertexDirected() {
    //     int maxVertex = -1;
    //     int maxDegree = -1;

    //     for (int i = 0; i < numVertices; i++) {
    //         int outDegree = adjList.get(i).size();
    //         if (outDegree > maxDegree) {
    //             maxDegree = outDegree;
    //             maxVertex = i;
    //         }
    //     }

    //     System.out.println("[List] Vertex with max OUT-DEGREE = " + (maxVertex + 1) + "  (out-degree = " + maxDegree + ")");
    //     return maxVertex;
    // }

    // public int findMaxOutWeightSumVertexDirected() {
    //     int maxVertex = -1;
    //     int maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i < numVertices; i++) {
    //         int sum = 0;
    //         List<Edge> edges = adjList.get(i);
    //         for (int j = 0; j < edges.size(); j++) {
    //             sum += edges.get(j).weight;
    //         }
    //         if (sum > maxSum) {
    //             maxSum = sum;
    //             maxVertex = i;
    //         }
    //     }

    //     System.out.println("[List] Vertex with max OUTGOING weight sum = " + (maxVertex + 1) + "  (sum = " + maxSum + ")");
    //     return maxVertex;
    // }

    // public AdjacencyListGraph convertToUndirected() {
    //     AdjacencyListGraph result = new AdjacencyListGraph(numVertices, false);
    //     boolean[][] processed = new boolean[numVertices][numVertices];

    //     for (int u = 0; u < numVertices; u++) {
    //         List<Edge> edges = adjList.get(u);
    //         for (int i = 0; i < edges.size(); i++) {
    //             Edge e = edges.get(i);
    //             int v = e.target;

    //             if (processed[u][v] || processed[v][u]) {
    //                 continue;
    //             }

    //             int forwardWeight = e.weight;
    //             int backwardWeight = findEdgeWeight(v, u);
    //             int combinedWeight = forwardWeight + backwardWeight;

    //             result.addEdge(u, v, combinedWeight);

    //             processed[u][v] = true;
    //             processed[v][u] = true;
    //         }
    //     }

    //     return result;
    // }

    // private int findEdgeWeight(int from, int to) {
        
    //     List<Edge> edges = adjList.get(from);
    //     for (int i = 0; i < edges.size(); i++) {
    //         Edge e = edges.get(i);
    //         if (e.target == to) {
    //             return e.weight;
    //         }
    //     }
    //     return 0;
    // }

    // public void printAdjList() {
    //     for (int i = 0; i < numVertices; i++) {
    //         String line = "Vertex " + (i + 1) + ": ";
    //         List<Edge> edges = adjList.get(i);
    //         for (int j = 0; j < edges.size(); j++) {
    //             Edge e = edges.get(j);
    //             line += "(" + (e.target + 1) + ", w=" + e.weight + ")  ";
    //         }
    //         System.out.println(line);
    //     }
    // }
}