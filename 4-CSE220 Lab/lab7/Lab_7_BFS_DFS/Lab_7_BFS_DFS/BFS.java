public class BFS {

    public static void main(String[] args){
        // --------------------------------------------------------
        // Matrix copied straight from the Task 1 image (Directed Weighted)
        // --------------------------------------------------------
        int[][] matrix = {
            {0, 5, 0, 0, 0, 0, 0},
            {5, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0},
            {0, 6, 4, 0, 0, 0, 0},
            {7, 0, 0, 2, 7, 0, 0},
            {11, 0, 0, 9, 10, 0, 0},
            {0, 0, 8, 0, 11, 0, 0}
        };
        int start = 6;

        boolean[] visited = new boolean[matrix.length];
        QueueLL q = new QueueLL();

        // Mark the starting vertex as visited
        visited[start] = true;

        // Enqueue the starting vertex
        q.enqueue(start);

        // manual "list" to remember dequeue order, no built-in collections
        int[] order = new int[matrix.length];
        int orderCount = 0;

        System.out.println("========== BFS ==========");
        System.out.println("BFS Traversal:");

        while (!q.isEmpty()) {

            // Dequeue a vertex
            int current = q.dequeue();

            order[orderCount] = current;
            orderCount++;

            System.out.println("At (" + current + ") Vertex ->");

            // Check all possible neighbors of current
            for (int i = 0; i < matrix.length; i++) {

                // If there is an edge from current to i (weight != 0)
                if (matrix[current][i] != 0) {

                    if (!visited[i]) {
                        // 1. Mark i as visited
                        visited[i] = true;
                        // 2. Enqueue i
                        q.enqueue(i);
                        // 3. Print the appropriate message
                        System.out.println("------> (" + i + ") is a new neighbor");
                    } else {
                        System.out.println("------> (" + i + ") already known");
                    }
                }
            }
        }

        System.out.println();
        System.out.println("BFS Traversal Order:");
        for (int i = 0; i < orderCount; i++) {
            System.out.print(order[i] + " ");
        }
        System.out.println();
    }
}