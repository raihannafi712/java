//Lab Task 02: Decryption Process
class LabTask2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        int row_size = matrix.length;
        int col_size = matrix[0].length;
        int[] sum = new int[col_size]; 

        for (int i = 0; i < col_size; i++) {
            
            for (int j = 0; j < row_size; j++) {
                
                sum[i] += matrix[j][i];

            }
        }

        Integer[] final_arr = new Integer[col_size - 1];

        for (int i = 0; i < final_arr.length; i++) {
            
            final_arr[i] = sum[i+1] - sum[i];

        }

        return final_arr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
