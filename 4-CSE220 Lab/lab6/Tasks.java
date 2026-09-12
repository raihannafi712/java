public class Tasks {


    //1 0A
    //Insert unweighted,weighted,undirected or directed graph matrix and it will make in a graph
    public static void adj_mat(int[][] mat){

        System.out.println("Adjacency Matrix");
        for (int i = 0; i < mat.length; i++) {

            System.out.print("Vertex " + i + "-> ");
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    //1 0B
    //Insert unweighted,weighted,undirected or directed graph matrix and it will make in a graph
    public static Edge[] adj_list(int[][] mat){

        int len = mat.length;                           //Row , col same length
        Edge[] adj_list = new Edge[len];                //This array will have nodes in each index so it has to be a object of Edge

        for (int i = 0; i < len; i++) {
            
            Edge head = null;
            Edge tail = null;

            for (int j = 0; j < len; j++) {
                
                if (mat[i][j] == 1) {
                    
                    // Edge n = new Edge(j);                            //For unweighted ones
                    Edge n = new Edge(j, mat[i][j], null);

                    if (head == null) {
                        head = n;
                        tail = n;
                    } else {
                        
                        tail.next = n;
                        tail = n;

                    }
                }
            }
            adj_list[i] = head;                         //connecting the head to the array's index each time
        }

    
        //Print
        for (int i = 0; i < len; i++) {
            System.out.print("Vertex " + i + ":");
            Edge curr = adj_list[i];
            while (curr != null) {
                System.out.print(" -> " + curr.target_vertex);
                curr = curr.next;
            }
            System.out.println(" -> null");
        }
        System.out.println();

        return  adj_list;

    }


    //Task1a
    public static void maxVertDegree(int[][] matrix) {
        
        int len = matrix.length;
        int max_degree = 0;
        int max_vertex_num = 0;
        

        for (int i = 0; i < len; i++) {

            int curr_degree = 0;

            for (int j = 0; j < len; j++) {
                
                if (matrix[i][j] == 1) {
                    curr_degree++;
                }
            }

            if (max_degree < curr_degree ) {
                
                max_degree = curr_degree;
                max_vertex_num = i;
            }
            
        }

        System.out.println("vertex " + max_vertex_num + " has highest vertex =" + max_degree);
    }
    

    //Task1b
    public static void maxDList(Edge[] mat){

        int max_degree = 0;
        int max_d_vert = 0;

        for (int i = 0; i < mat.length; i++) {

            int node_count = 0;
            Edge curr_node = mat[i];                        //Accessing the head of that index               
            
            while (curr_node != null) {
                node_count++;
                curr_node = curr_node.next;
            }

            if (max_degree < node_count) {
                
                max_degree = node_count;
                max_d_vert = i;
            }
        }
        System.out.println("vertex " + max_d_vert + " has highest vertex =" + max_degree);
    }












    

    //Task2a
     public static void WeightedMaxVertDegree(int[][] matrix) {
        
        int len = matrix.length;
        int max_degree_sum = 0;
        int max_vertex_num = 0;
        

        for (int i = 0; i < len; i++) {

            int curr_degree_sum = 0;

            for (int j = 0; j < len; j++) {
                
                if (matrix[i][j] != 0) {
                    curr_degree_sum += matrix[i][j];
                }
            }

            if (max_degree_sum < curr_degree_sum ) {
                
                max_degree_sum = curr_degree_sum;
                max_vertex_num = i;
            }
            
        }

        System.out.println("vertex " + max_vertex_num + " has highest edge weight sum = " + max_degree_sum);
    }



    //Task 2b
        public static void WeightedMaxDList(Edge[] mat){

        int max_degree_sum = 0;
        int max_d_vert = 0;

        for (int i = 0; i < mat.length; i++) {

            int node_count_sum = 0;
            Edge curr_node = mat[i];                        //Accessing the head of that index               
            
            while (curr_node != null) {
                node_count_sum += curr_node.elem;
                curr_node = curr_node.next;
            }

            if (max_degree_sum < node_count_sum) {
                
                max_degree_sum = node_count_sum;
                max_d_vert = i;
            }
        }
        System.out.println("vertex " + max_d_vert + " has highest vertex =" + max_degree_sum);
    }

















    //Outgoing edge means A -> B. Here A's outgoing edge points at B
    //Task 3a
    public static void DirectedAdjMat(int[][] mat){                 //It will print how many outgoing edges each vertex has
        
        int len = mat.length;
        int max_sum = 0;
        int max_sum_vert = 0;
        int max_edge = 0;
        int max_edge_vert = 0;


        for (int i = 0; i < len; i++) {

            int curr_edge = 0;
            int curr_sum = 0;
            
            for (int j = 0; j < len; j++) {

                if (mat[i][j] != 0) {
                    curr_edge++;
                    curr_sum += mat[i][j];
                }
            }
            if (max_edge < curr_edge) {
                max_edge = curr_edge;
                max_edge_vert = i;
            }
            if (max_sum < curr_sum) {
                max_sum = curr_sum;
                max_sum_vert = i;
            }
        }

        System.out.println("Max edges is in the vertex " + max_edge_vert + "= " + max_edge);
        System.out.println("Max edge sum is in the vertex " + max_sum_vert + "= " + max_sum);
    }


    //Task 3b
    public static void DirectedAdjList(Edge[] mat) {
        int len = mat.length;
        int max_sum = 0;
        int max_sum_vert = 0;
        int max_edge = 0;
        int max_edge_vert = 0;

        for (int i = 0; i < len; i++) {
            int curr_edge = 0;
            int curr_sum = 0;
            Edge curr_node = mat[i]; // Access head of list for vertex i

            while (curr_node != null) {
                curr_edge++;                 // Count outgoing edges
                curr_sum += curr_node.elem;  // Add outgoing edge weight
                curr_node = curr_node.next;  // Move to next adjacent edge
            }

            if (curr_edge > max_edge) {
                max_edge = curr_edge;
                max_edge_vert = i;
            }

            if (curr_sum > max_sum) {
                max_sum = curr_sum;
                max_sum_vert = i;
            }
        }

        System.out.println("Max edges is in the vertex " + max_edge_vert + " = " + max_edge);
        System.out.println("Max edge sum is in the vertex " + max_sum_vert + " = " + max_sum);
    }



















    //Task 4a (Directed,weighted graph to Undirected,weighted graph)
    public static int[][] Task4a(int[][] mat) {
        int len = mat.length;
        int[][] undir_mat = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (mat[i][j] != 0) {
                    // Add the weight to both directions
                    // If bidirectional, visiting (j,i) later automatically sums them up
                    undir_mat[i][j] += mat[i][j];
                    undir_mat[j][i] += mat[i][j];
                }
            }
        }

        return undir_mat;
    }



    //TASk 4b
    public static Edge[] Task4b(Edge[] mat) {
        int len = mat.length;
        Edge[] undir_list = new Edge[len];

        for (int i = 0; i < len; i++) {
            Edge curr = mat[i];
            while (curr != null) {
                int u = i;
                int v = curr.target_vertex;
                int weight = curr.elem;

                // Add/Sum weight in both directions
                addEdge(undir_list, u, v, weight);
                addEdge(undir_list, v, u, weight);

                curr = curr.next;
            }
        }

        return undir_list;
    }

    // Helper method to add an edge or sum its weight if it already exists
    public static void addEdge(Edge[] list, int u, int v, int weight) {
        Edge curr = list[u];
        Edge prev = null;

        while (curr != null) {
            if (curr.target_vertex == v) {
                // Edge already exists, sum up the weights for bidirectional case
                curr.elem += weight;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        // Edge does not exist yet, create a new Edge node
        Edge n = new Edge(v, weight, null);
        if (list[u] == null) {
            list[u] = n;
        } else {
            prev.next = n;
        }
    }


    public static void main(String[] args) {
        

        //TASK 0A
        int[][] adj_mat = {                             //undirected, unweighted graph
            {0, 1, 0, 1, 0, 1, 0}, 
            {1, 0, 1, 0, 1, 0, 0}, 
            {0, 1, 0, 0, 1, 1, 0}, 
            {1, 0, 1, 0, 1, 1, 0}, 
            {0, 0, 0, 1, 0, 1, 0}, 
            {0, 1, 1, 1, 1, 0, 1}, 
            {1, 0, 1, 0, 0, 1, 0}
        };

        adj_mat(adj_mat);

        //TASK 0B
        Edge[] adjList = adj_list(adj_mat);

        //Task1a
        maxVertDegree(adj_mat);

        //Task1b
        maxDList(adjList);

        //Task2a
        int[][] matrix = {                                  //undirected, edge-weighted graph
            { 0,  4,  2,  7,  0,  3,  0}, // Vertex 0
            { 4,  0,  1,  0,  8,  0,  2}, // Vertex 1
            { 2,  1,  0,  3,  0,  5,  0}, // Vertex 2
            { 7,  0,  3,  0,  0,  0,  9}, // Vertex 3
            { 0,  8,  0,  0,  0,  6, 10}, // Vertex 4
            { 3,  0,  5,  0,  6,  0,  4}, // Vertex 5
            { 0,  2,  0,  9, 10,  4,  0}  // Vertex 6
        };

        WeightedMaxVertDegree(matrix);



        //Task 3a,3b
        int[][] matrix2 = {                                  //Directed,edge weighted graph
            { 0, 10, 15,  0,  0}, // Vertex 0 -> Out-degree: 2, Out-weight sum: 25
            { 0,  0,  3,  2,  4}, // Vertex 1 -> Out-degree: 3, Out-weight sum: 9  (Highest degree)
            { 0,  0,  0,  0, 30}, // Vertex 2 -> Out-degree: 1, Out-weight sum: 30 (Highest weight sum)
            { 5,  0,  0,  0,  5}, // Vertex 3 -> Out-degree: 2, Out-weight sum: 10
            { 0,  0,  0,  0,  0}  // Vertex 4 -> Out-degree: 0, Out-weight sum: 0
        };

        DirectedAdjMat(matrix2);



        //Task 4

        //Making matrix2's adj matrix and list
        adj_mat(matrix2);
        adj_list(matrix2);




    }


}   

