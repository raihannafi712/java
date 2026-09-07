/**
 * DRIVER CLASS
 * ------------
 * Uses the graph drawn on graphonline.top: 7 vertices, 12 directed edges.
 *
 * IMPORTANT ON NUMBERING:
 * graphonline.top labels vertices 1-7. Java arrays are 0-indexed, so
 * internally vertex 1 = index 0, vertex 2 = index 1, ... vertex 7 = index 6.
 * All println statements in AdjacencyMatrixGraph / AdjacencyListGraph already
 * add 1 back when printing, so the numbers you see in the console output
 * match your drawing directly (no manual conversion needed).
 *
 * HOW TASK 2 GETS ITS GRAPH:
 * Task 2 needs an UNDIRECTED edge-weighted graph, but the graph drawn is
 * DIRECTED. Instead of drawing a second graph, we reuse the Task 4
 * conversion function (directed -> undirected, summing bidirectional edges)
 * to produce the undirected graph that Task 2 operates on. This is exactly
 * what Task 4 is for, so it also proves Task 4's function is correct.
 */
public class Tester {
    public static void main(String[] args) {

        int[][] directedMatrix = {
                {0, 5, 3, 0, 0, 0, 0},
                {2, 0, 0, 4, 0, 0, 0},
                {0, 3, 0, 0, 6, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 8, 0},
                {0, 0, 0, 2, 0, 0, 7},
                {1, 0, 4, 0, 0, 0, 0}
        };

        AdjacencyMatrixGraph directedGraphMatrix =
        
            new AdjacencyMatrixGraph(directedMatrix, true);

        AdjacencyListGraph directedGraphList =

            new AdjacencyListGraph(7, true);

        directedGraphList.addEdge(0, 1, 5);
        directedGraphList.addEdge(0, 2, 3);
        directedGraphList.addEdge(1, 0, 2);
        directedGraphList.addEdge(1, 3, 4);
        directedGraphList.addEdge(2, 1, 3);
        directedGraphList.addEdge(2, 4, 6);
        directedGraphList.addEdge(3, 4, 1);
        directedGraphList.addEdge(4, 5, 8);
        directedGraphList.addEdge(5, 3, 2);
        directedGraphList.addEdge(5, 6, 7);
        directedGraphList.addEdge(6, 0, 1);
        directedGraphList.addEdge(6, 2, 4);

        int[][] undirectedMatrix = directedGraphMatrix.convertToUndirected();

        AdjacencyMatrixGraph undirectedGraphMatrix =
            new AdjacencyMatrixGraph(undirectedMatrix, false);

        AdjacencyListGraph undirectedGraphList =
            directedGraphList.convertToUndirected();

        System.out.println(" TASK 2: Undirected, Edge-Weighted Graph");
        System.out.println(" (vertex with the maximum sum of edge weights)");


        undirectedGraphMatrix.findMaxWeightSumVertexUndirected();
        undirectedGraphList.findMaxWeightSumVertexUndirected();

        System.out.println();

        System.out.println(" TASK 3: Directed, Edge-Weighted Graph ");


        directedGraphMatrix.findMaxOutDegreeVertexDirected();
        directedGraphMatrix.findMaxOutWeightSumVertexDirected();
        directedGraphList.findMaxOutDegreeVertexDirected();
        directedGraphList.findMaxOutWeightSumVertexDirected();

        System.out.println();
        System.out.println(" TASK 4: Convert Directed -> Undirected Weighted Graph");

        System.out.println("Converted undirected matrix:");
        directedGraphMatrix.printMatrix(undirectedMatrix);

        System.out.println("Converted undirected adjacency list:");
        undirectedGraphList.printAdjList();
    }
}