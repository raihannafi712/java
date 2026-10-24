//Assignment Task 04: Rotate Secret
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //If needed you can create extra helper static methods
    //if extra helper methods are used then you must submit those as well
    public static void rotateSecret(Character[][] board) {
        
        int mat_len = board.length;
        int layer_main = mat_len / 2;

        for (int layer = 0; layer < layer_main; layer++) {

            int rotate_time = layer_main - layer;
            for (int turn = 0; turn < rotate_time; turn++) {

                rotateLayerOnce(board, layer);
            }
        }

        for (int i = 0; i < mat_len; i++) {

            for (int j = 0; j < mat_len; j++) {
                System.out.print(board[i][j]);
            }
        }

        System.out.println();
    }

    public static void rotateLayerOnce(Character[][] board, int layer) {

        int lay_first = layer;
        int lay_last = board.length - 1 - layer;

        Character top_left = board[lay_first][lay_first];

        for (int i = lay_first; i < lay_last; i++) {

            board[i][lay_first] = board[i + 1][lay_first];
        }
        for (int j = lay_first; j < lay_last; j++) {

            board[lay_last][j] = board[lay_last][j + 1];
        }
        for (int i = lay_last; i > lay_first; i--) {

            board[i][lay_last] = board[i - 1][lay_last];
        }
        for (int j = lay_last; j > lay_first + 1; j--) {

            board[lay_first][j] = board[lay_first][j - 1];
        }
        
        board[lay_first][lay_first + 1] = top_left;
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
