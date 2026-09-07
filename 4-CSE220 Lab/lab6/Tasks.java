public class Tasks {


    //1 0A
    public static void adj_mat(int[][] mat){

        System.out.println("=== Task 0a: Adjacency Matrix ===");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    //1 0B
    public static Edge[] adj_list(int[][] mat){

        int mat_length = mat.length;
        Edge[] adj_list = new Edge[mat_length];             //This array takes LL head's add elements

        for (int i = 0; i < mat_length; i++) {              //array wise vertex (row)

            Edge head = null;                               //Each new row creates new head for that vertex
            Edge tail = null;
            
            for (int j = 0; j < mat_length; j++) {          //each vertex nodes (column)
             
                if (mat[i][j] == 1) {

                    Edge n = new Edge(j);
                    
                    if (head == null) {
                        head = n;
                        tail = n;
                    }else{
                        tail.next = n;
                        tail = n;
                    }
                    
                }
            }
            adj_list[i] = head;                             //Each row has the head of each vertex list
        }


        //Print
        for (int i = 0; i < mat_length; i++) {
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



    public static void task1a(int[][] matrix) {
        int maxDegree = -1;
        int maxVertex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int degree = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    degree++;
                }
            }
            if (degree > maxDegree) {
                maxDegree = degree;
                maxVertex = i;
            }
        }

        System.out.println("=== Task 1a (Matrix) ===");
        System.out.println("Vertex with max degree: Vertex " + maxVertex + " (Degree = " + maxDegree + ")\n");
    }

    // -------------------------------------------------------------
    // Task 1b: Max Degree using Adjacency List
    // -------------------------------------------------------------
    public static void task1b(Edge[] adjList) {
        int maxDegree = -1;
        int maxVertex = -1;

        for (int i = 0; i < adjList.length; i++) {
            int degree = 0;
            Edge curr = adjList[i];
            while (curr != null) {
                degree++;
                curr = curr.next;
            }

            if (degree > maxDegree) {
                maxDegree = degree;
                maxVertex = i;
            }
        }

        System.out.println("=== Task 1b (List) ===");   
        System.out.println("Vertex with max degree: Vertex " + maxVertex + " (Degree = " + maxDegree + ")\n");
    }
    





    public static void main(String[] args) {
        

        //TASK 0A
        int[][] adj_mat = { 
            {0, 1, 0, 1, 0, 1, 0}, 
            {1, 0, 1, 0, 1, 0, 0}, 
            {0, 1, 0, 0, 1, 1, 0}, 
            {1, 0, 1, 0, 1, 1, 0}, 
            {0, 0, 0, 1, 0, 1, 0}, 
            {0, 1, 1, 1, 1, 0, 1}, 
            {1, 0, 1, 0, 0, 1, 0}
        };

        adj_mat(adj_mat);
        Edge[] adjList = adj_list(adj_mat);


        task1a(adj_mat);
        task1b(adjList);
    }


}   

