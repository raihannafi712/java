public class DFS {

    public static void main(String[] args){
        // Matrix copied straight from the Task 2 image (Directed Unweighted)
        int[][] matrix = {
            {0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 1, 0},
            {1, 0, 0, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0}
        };
        int start = 6;

        boolean[] visited = new boolean[matrix.length];

        System.out.println("========== DFS ==========");
        System.out.println("DFS Traversal:");

        dfs_visit(matrix, start, visited);

        System.out.println();
        System.out.println("DFS Traversal Order:");
        printOrder();
    }

    // simple manual "list" to remember the order without built-in collections
    static int[] order = new int[100];
    static int orderCount = 0;

    public static void dfs_visit(int[][] matrix, int current, boolean[] visited) {

        // Mark current as visited
        visited[current] = true;

        // Record it for the final order print
        order[orderCount] = current;
        orderCount++;

        // Process current
        System.out.println("Visiting (" + current + ")");

        // Check all possible neighbors
        for (int i = 0; i < matrix.length; i++) {

            // If there is an edge from current to i and i has not been visited
            if (matrix[current][i] != 0 && !visited[i]) {
                dfs_visit(matrix, i, visited);
            }
        }
    }

    public static void printOrder() {
        for (int i = 0; i < orderCount; i++) {
            System.out.print(order[i] + " ");
        }
        System.out.println();
    }
}