public class AdjacencyMatrixGraph {

    private int[][] matrix;
    private int vertice_num;
    private boolean directed;

    public AdjacencyMatrixGraph(int[][] matrix, boolean directed) {
        this.matrix = matrix;
        this.vertice_num = matrix.length;
        this.directed = directed;
    }

    public int getNumVertices() {
        return vertice_num;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int findMaxWeightSumVertexUndirected() {
        int maxVertex = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < vertice_num; i++) {
            int sum = 0;
            for (int j = 0; j < vertice_num; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxVertex = i;
            }
        }

        System.out.println("[Matrix] Vertex with max weight sum = " + (maxVertex + 1) + "  (sum = " + maxSum + ")");
        return maxVertex;
    }

    public int findMaxOutDegreeVertexDirected() {
        int maxVertex = -1;
        int maxDegree = -1;

        for (int i = 0; i < vertice_num; i++) {
            int outDegree = 0;
            for (int j = 0; j < vertice_num; j++) {
                if (matrix[i][j] != 0) {
                    outDegree++;
                }
            }
            if (outDegree > maxDegree) {
                maxDegree = outDegree;
                maxVertex = i;
            }
        }

        System.out.println("[Matrix] Vertex with max OUT-DEGREE = " + (maxVertex + 1) + "  (out-degree = " + maxDegree + ")");
        return maxVertex;
    }

    public int findMaxOutWeightSumVertexDirected() {
        int maxVertex = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < vertice_num; i++) {
            int sum = 0;
            for (int j = 0; j < vertice_num; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxVertex = i;
            }
        }

        System.out.println("[Matrix] Vertex with max OUTGOING weight sum = " + (maxVertex + 1) + "  (sum = " + maxSum + ")");
        return maxVertex;
    }

    public int[][] convertToUndirected() {
        int[][] result = new int[vertice_num][vertice_num];

        for (int i = 0; i < vertice_num; i++) {
            for (int j = 0; j < vertice_num; j++) {
                if (i == j) {
                    result[i][j] = matrix[i][j];
                } else {
                    result[i][j] = matrix[i][j] + matrix[j][i];
                }
            }
        }
        return result;
    }

    public void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            String row = "[";
            for (int j = 0; j < m[i].length; j++) {
                row += m[i][j];
                if (j < m[i].length - 1) {
                    row += ", ";
                }
            }
            row += "]";
            System.out.println("Vertex " + (i + 1) + ": " + row);
        }
    }
}