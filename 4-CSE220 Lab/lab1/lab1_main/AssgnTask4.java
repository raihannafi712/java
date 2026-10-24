//Assignment Task 04: Rotate Secret
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //If needed you can create extra helper static methods
    //if extra helper methods are used then you must submit those as well
    public static void rotateSecret( Character[][] board ){

        int row_size = board.length;
        int col_size = board[0].length;

        int n = board.length;
        // int numLayers = n / 2;

        // for (int layer = 0; layer < numLayers; layer++) {
        //     int top = layer, bottom = n - 1 - layer;
        //     int left = layer, right = n - 1 - layer;
        //     int m = right - left + 1;        // side length of this layer
        //     int ringLength = 4 * (m - 1);    // total tiles on this ring
        //     int rotations = numLayers - layer; // innermost = 1, +1 per layer outward

        //     for (int r = 0; r < rotations; r++) {

        //         // ---- one clockwise shift of the entire ring ----

        //         int i = ringLength - 1;
        //         int curRow, curCol;
        //         // find (row, col) of the LAST index on the ring
        //         if (i <= m - 2)          { curRow = top;                    curCol = left + i; }
        //         else if (i <= 2*m - 3)   { curRow = top + (i - (m - 1));    curCol = right; }
        //         else if (i <= 3*m - 4)   { curRow = bottom;                 curCol = right - (i - (2*m - 2)); }
        //         else                     { curRow = bottom - (i - (3*m-3)); curCol = left; }

        //         char saved = board[curRow][curCol]; // this tile wraps around to index 0

        //         for (; i >= 1; i--) {
        //             int j = i - 1;
        //             int prevRow, prevCol;
        //             if (j <= m - 2)        { prevRow = top;                    prevCol = left + j; }
        //             else if (j <= 2*m - 3) { prevRow = top + (j - (m - 1));    prevCol = right; }
        //             else if (j <= 3*m - 4) { prevRow = bottom;                 prevCol = right - (j - (2*m - 2)); }
        //             else                   { prevRow = bottom - (j - (3*m-3)); prevCol = left; }

        //             board[curRow][curCol] = board[prevRow][prevCol]; // pass the tile forward
        //             curRow = prevRow;
        //             curCol = prevCol;
        //         }

        //         board[top][left] = saved; // index 0 is always the top-left corner
        //     }
        // }

        // // print the recovered message
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(board[i][j]);
        //     }
        // }
        // System.out.println();

        

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
          {'T','A','U','S'},
          {'A','R','I','.'},
          {'D','T','T','N'},
          {'S','C','F','U'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
            {'D','A','T','A'},
            {'S','T','R','U'},
            {'C','T','I','S'},
            {'F','U','N','.'}
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 1 Success");
        else System.out.println("Test 1 FAILED");
        
        System.out.print("\n===========Test#2===========\n");

        board = new Character[][]{
          {'O','R','I','R','N','P'},
          {'G','S','A','A','L','R'},
          {'L','M','N','O','N','Y'},
          {'A','H','U','O','O','P'},
          {'T','F','C','T','H','S'},
          {'E','D','Y','O','C','K'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][]{
            {'A','L','G','O','R','I'},
            {'T','H','M','S','A','R'},
            {'E','F','U','N','A','N'},
            {'D','C','O','O','L','P'},
            {'Y','T','H','O','N','R'},
            {'O','C','K','S','P','Y'}
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 2 Success");
        else System.out.println("Test 2 FAILED");
    }
}
