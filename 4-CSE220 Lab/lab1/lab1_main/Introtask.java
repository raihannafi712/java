public class Introtask {
    
    public static void main(String[] args) {

        // Given matrix
        int[][] matrix = { 
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
            {1 , 4 , 2 , 8 , 6}
        };



        // I
        System.out.println("row wise-");

        for (int i = 0; i < matrix.length; i++) {               /* Row */
            
            for (int j = 0; j < matrix[0].length; j++) {        /* Column */
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        // II
        System.out.println("column wise");
        for (int j = 0; j < matrix[0].length; j++) {
            
            for (int j2 = 0; j2 < matrix.length; j2++) {
                System.out.print(matrix[j2][j] + " ");
            }
            System.out.println();
        }



        // IV   (IMPORTANT)         /* Diagonals are in any (n x n) matrix */
        int p_sum = 0;              /* (0,0) , (1,1) . (2,2) , (3,3) , (4,4) -> For this 5x5 matrix */
        int s_sum = 0;              /* (0,4) , (1,3) , (2,2) , (3,1) , (4,0) */ /* Look at the points, rows go 0,1,2... and columns go 2,1,0... */
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            
            p_sum += matrix[i][i];
            s_sum += matrix[i][n - 1 - i];          //memorize a bit    


        }

        System.out.println(Math.abs(p_sum - s_sum));        // 3



        // V (Transpose matrix)

        System.out.println("Original matrix-");

        for (int i = 0; i < matrix.length; i++) {               /* Row */
            
            for (int j = 0; j < matrix[0].length; j++) {        /* Column */
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        // II
        System.out.println("Transpose matrix");
        for (int j = 0; j < matrix[0].length; j++) {
            
            for (int j2 = 0; j2 < matrix.length; j2++) {
                System.out.print(matrix[j2][j] + " ");
            }
            System.out.println();
        }

    }
}
