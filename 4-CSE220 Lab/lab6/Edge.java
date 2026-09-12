/**
 * A single edge stored inside an adjacency list.
 * "target" = the vertex this edge points to.
 * "weight" = the weight of that edge.
 */
public class Edge {

    int target_vertex;                          //For directed graph
    int elem;                                   // Weight of the directed edge
    Edge next;                                  // Reference to the next outgoing edge in the list

    
    //Both constructor works for undirected and directed graphs
    //For unweighted graph
    public Edge(int target_vertex){

        this.target_vertex = target_vertex;
        this.next = null;

    }

    //For weighted graphs
    public Edge(int to, int elem, Edge next) {
        this.target_vertex = to;
        this.elem = elem;
        this.next = next;
    }
}