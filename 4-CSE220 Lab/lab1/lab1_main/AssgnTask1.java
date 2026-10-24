//Assignment Task 01: Row Rotation Policy
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){       /* Check  note to see how  rotation happens  */

        int row_size = matrix.length;
        int col_size = matrix[0].length;
        int rotation = examWeek-1;

        for (int i = 0; i < rotation; i++) {
            
            String[] temp = new String[1];
            temp = matrix[row_size - 1];                /* temp[0] would be wrong because we are assigning a whole row to a linear array */

            for (int j = (row_size-1); j > 0; j--) {
                
                matrix[j] = matrix[j-1];
            }
            matrix[0] = temp;

        }

        String f = "AA";

        int row = 0;
        for (int i = 0; i < row_size; i++) {
            
            for (int j = 0; j < col_size; j++) {
                
                System.out.print(matrix[i][j] + " ");
                if (f.equals(matrix[i][j])) {
                    row = i+1;
                }

            }
            System.out.println();
        }

        return row;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}
