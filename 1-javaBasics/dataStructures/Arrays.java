package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {

        // Arrays

        // 1D arrays-

        // int [] arr1 = new int [4];
        // int [] arr2 = new int [] {1,4,5,6,7};
        // int [] arr3 = {4,5,6,7,8,8,0,0,0};               /* preferable way */ /*length = 8 , size = 5  */
        // String [] arr4 = new String[4];                  /* This means arr4 array's length is 4 */
        // ArrayList<Integer> bookList = new ArrayList<>();    /* Datatype needs to be typed the whole word.Arraylist changes dynamically */



        // Multidimentional arrays

        // 2D arrays- (REPRESENTS A TABLE OR MATRIX)
        // int [][] arr5 = new int[3][3];             /* Array initialization */  /* 3 rows and 3 columns */
        // arr5 [0][0] = 1;                          /* (0,0) (just like matrix) element is now 1 */
        // arr5 [0][1] = 2;
        // arr5 [0][2] = 3;
        // arr5 [1][0] = 4;
        // arr5 [1][1] = 5;
        // arr5 [1][2] = 6;
        // arr5 [2][0] = 7;
        // arr5 [2][1] = 8;
        // arr5 [2][2] = 9;
        
        // OR (To assign values directly)
        // int [][] arr6 = {{1,2,3} , {4,5,6} , {7,8,9}};    /* Respectively ROW 0,1,2 */


        // CHECK THE CONNECTION BETWEEN THIS 2D ARRAY AND MATRIX IN THE NOTES (JAVA)
        // 2D ARRAYS AND MATRIX BOTH CAN HAVE DIFFERENT ROW AND COLUMNS LENGTHS. THEY ARE NOT NECESSARILY SQUARE.





        // 3D arrays- (REPRESENTS A CUBE OR A BOX)
        // int [][][] arr7 = new int [3][3][3];        /* 3 layers, 3 rows and 3 columns (27 elements 9*3) */ /* row = 0,1,2 ; column = 0,1,2 */

        // arr7 [0][0][0] = 1;                         /* (0,0,0) (just like matrix) element is now 1 */
        // arr7 [0][0][1] = 2;
        // arr7 [0][0][2] = 3;
        // arr7 [0][1][0] = 4; 
        // arr7 [0][1][1] = 5;
        // arr7 [0][1][2] = 6;
        // arr7 [0][2][0] = 7;
        // arr7 [0][2][1] = 8;
        // arr7 [0][2][2] = 9;
        // arr7 [1][0][0] = 10;
        // arr7 [1][0][1] = 11;
        // arr7 [1][0][2] = 12;
        // arr7 [1][1][0] = 13;
        // arr7 [1][1][1] = 14;
        // arr7 [1][1][2] = 15;
        // arr7 [1][2][0] = 16;
        // arr7 [1][2][1] = 17;
        // arr7 [1][2][2] = 18;
        // arr7 [2][0][0] = 19;
        // arr7 [2][0][1] = 20;
        // arr7 [2][0][2] = 21;
        // arr7 [2][1][0] = 22;
        // arr7 [2][1][1] = 23;
        // arr7 [2][1][2] = 24;
        // arr7 [2][2][0] = 25;
        // arr7 [2][2][1] = 26;
        // arr7 [2][2][2] = 27;

        // See the output and check the representation on the notes

        // OR (To assign values directly)
        // int [][][] arr8 = {{{1,2} , {3,4}}} , {{5,6} , {7,8}} , {{9,10} , {11,12}}};    /* Respectively LAYER 0,1,2 ; ROW 0,1 ; COLUMN 0,1 */
        







        // LINEAR INDEX (CHECK NOTE FOR BASICS)

        // FOR 3D arrays-

        // If linear index and D1xD2xD3  is given
        // i = linear ÷ (d2 × d3)        → linear index across first dimension
        // j = (linear ÷ d3) % d2        → index across second dimension  
        // k = linear % d3               → index across third dimension


        // If 3D dimensions and D1xD2xD3 is given
        //linear = i×(D2×D3) + j×(D3) + k

        //So linear index 23 means: "the 24th slot in that long row" (23 if you start counting from 0). For your 3D array, which has 2×3×4 = 24 total slots, slot 23 is literally the very last one — there's no slot 24, the row ends there.



        // FOR 2D arrays-

        // If linear index and D1xD2 is given
        // i = linear / D2               → linear index across first dimension
        // j = linear % D2               → index across second dimension  

        // If 2D dimensions and D1xD2 is given
        //linear = i * D2 + j








        // TO PRINT

        // 2D arrays
        // System.out.println("2D matrix - " + Arrays.deepToString(arr5));
        
        // 3D arrays
        // System.out.println("3D matrix - " + Arrays.deepToString(arr7));

        // Or Use loops









        //                                  /* TO CHECK LENGTH */

        // One - dimensional arrays-
        // System.err.println(arr3.length);         




        // 2D arrays                /* Rows and column lengths are shown separately */
        
        // System.out.println("Row length = " + arr6.length);        /* ROW's length */
        // System.out.println("Column length = " + arr6[0].length);  /* Columns's length */





        

        //                                /* to Print Or Traverse */


        // One - dimensional arrays-
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));

        // Two- dimensional arrays -
        // System.out.println(Arrays.deepToString(arr3));
        // System.out.println(Arrays.deepToString(arr4));

        // 3D arrays-
        // System.out.println(Arrays.deepToString(arr3));
        // System.err.println(arr3.length);


        // System.out.println(arr3[3]);             /* to print exact values */
        // System.out.println(arr3);                /* To see the array's memory location */




        // FOR 2D ARRAYS                            /* Only possible through nested loop */

        // for (int i = 0; i < arr5.length; i++) {         /* For the ROWS */
            
        //     System.out.println();

        //     for (int j = 0; j < arr5.length; j++) {     /* For the COLUMNS */
                
        //         System.out.print(arr5[i][j] + " " );
        //     }
        // }



        // for (int i = 0; i < arr6.length; i++) {             /* For the ROWS */
            
        //     System.out.println();

        //     for (int j = 0; j < arr6[0].length; j++) {     /* For the COLUMNS */
                
        //         System.out.print(arr6[i][j]  + " " );
        //     }
        // }








        //                          /* to change values inside array */

        // 1D arrays-

        // arr3[3] = 99;
        // System.out.println(arr3[3]);










        //                          /* To create an array form user input */

        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter array size: ");
        // int size = sc.nextInt();

        // int [] arr5 = new int[size];

        // for (int i = 0; i < size; i++) {           /* if size is 4 then elements will be 0,1,2,3 thats why i < size */
            
        //     System.out.println("Enter the element: ");
        //     int element = sc.nextInt();
        //     arr5[i] = element;
        // }
        // System.out.println(Arrays.toString(arr5));
        // sc.close();









        //                                  /* To see all elements individually */

        // int [] arr6 = {1,2,4,45,5,6,6,};

        // for (int i = 0; i < arr6.length; i++) {
        //     System.out.println(arr6[i]);
        // }

        //                                  /* To see all elements individually in reverse */

        // int [] arr6 = {1,2,4,45,5,6,6};

        // for (int i = arr6.length-1 ; i >= 0 ; i--) {   /* length-1 because if length is 4, there is no index as 4 (0,1,2,3) */
        //     System.out.println(arr6[i]);
        // }











        //                                      /* Array reference */

        // int [] arr7 = {22,45,567,54,354,33,33};
        // int [] b;                                            /* Initializing new array */
        // b = arr7;                                            /* connecting the memory location  */

        // System.out.println(Arrays.toString(b));

        // b[2] = 987;                                    /* arr7 and b array's memory locations are the same   */

        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(arr7));

















        

        //                              /* Sorting */

        // Inbuilt sorting method

        // int [] arr8 = {2,3,8,5,6,7,9,4,3};
        // Arrays.sort(arr8);
        // System.out.println(Arrays.toString(arr8));



        // In place sorting-


        //                               /* Bubble sort and selection sort*/
    
        // Scanner sc = new Scanner(System.in);
        // System.out.println("N= ");
        // int N = sc.nextInt();

        // int [] arr = new int[N];

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Enter a number:");
        //     int n = sc.nextInt();

        //     arr[i] = n;
        // }

        // System.out.println("Original array");
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();





        //BUBBLE SORT(Basically it pushes the lowest or highest number to the last element in each traversal)


        // Sorting in descending order - 
        // for (int i = 0; i < arr.length - 1; i++) {
            
        //     for (int j = 0; j < arr.length - i - 1; j++) {
                
        //         if (arr[j] < arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }





        // // Sorting in ascending order -
        // // for (int i = 0; i < arr.length - 1; i++) {
            
        // //     for (int j = 0; j < arr.length - i - 1; j++) {
                
        // //         if (arr[j] > arr[j+1]) {
        // //             int temp = arr[j];
        // //             arr[j] = arr[j+1];
        // //             arr[j+1] = temp;
        // //         }
        // //     }
        // // }

        // System.out.println("Updated array");
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.print(arr[i] + " ");
        // }







        //Selection Sort (It takes the max and min value of the array)















        


        // Data structures
        
        // Sorting

        // Reversing arrays

        // Out of place algorithm
        // int [] arr1 = {10,20,30,40,50};

        // arr1 = reverseOut(arr1);
        // System.out.println(Arrays.toString(arr1));



        // In place algorithm
        int [] arr1 = {10,20,30,40,50};

        reverseIn(arr1);
        System.out.println("In place apporach = " + Arrays.toString(arr1));


















        // Right shifting an array by one place (start from the right side and k is the number of places it will shift )

        // Scanner sc = new Scanner(System.in);
        // System.out.print("K = ");
        // int k = sc.nextInt();

        // int [] arr1 = {10,20,30,40,50};
        // rightShift(arr1 , k);










        // // Replacing elements
        // int [] arr2 = {10,20,30,40,50,0,0,0};
        // System.out.println("Before = " + Arrays.toString(arr2));

        // arr2 [2] = 200;
        // System.out.println("After = " + Arrays.toString(arr2));










        // Insertion
        // int [] arr3 = {10,20,30,40,50,0,0,0};       /* size = 5 , length = 8 */

        //  0 - 5 indexes are valid for insertion

        // // Insert 200 in index 2

        // insertCheck(arr3, 2, 200, 5);








        // // Removal  (Left shift which starts from the left side) /* size reduces by 1 */

        // int [] arr4 = {10,20,30,40,50,0,0,0};       /* size = 5 , length = 8 */

        //  0 - 4 indexes are valid for removal



        // removal(arr4, 2, 5);
















    }










    /* METHODS */

    // Reversing 

    // Out of place approach

    public static int [] reverseOut(int[] arr1){

        int [] arr2 = new int [arr1.length];

        for (int i = 0, j = arr2.length - 1; i < arr1.length; i++, j--) {
            
            arr2[j] = arr1[i];
        }

        return arr2;
    }





    // In place approach

    public static void reverseIn(int[] arr1){

        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;

        }
    }















    // Right shift
    public static void rightShift(int [] arr1 , int k){
        for (int i = arr1.length - 1; i >= 0; i--) {
                
            if (i > k - 1 ) {
                arr1 [i] = arr1[i - k];
            } else {
                arr1 [i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }






    // Insertion

    public static void insertCheck(int [] arr3 , int index , int val , int size){

        if (arr3.length == size) {
            System.out.println("No space for insertion");


        } else if (index < 0 || index > size ) {
            System.out.println("Invalid index!");

        }else {

        System.out.println("Before insertion = " + Arrays.toString(arr3));

        for (int i = size + 1; i >= index; i--) {
                
            if (i > index ) {
                arr3 [i] = arr3[i - 1];
            } else {
                arr3 [i] = val;
            }
        }

        System.out.println("After insertion =" + Arrays.toString(arr3));
        }

    }









    // Removal
    public static void removal(int [] arr4 , int index , int size){

        System.out.println("Before removal = " + Arrays.toString(arr4));
        for (int i = index ; i <= size; i++) {
                
            if (i < size - 1 ) {
                arr4 [i] = arr4[i + 1];
            } else {
                arr4 [i] = 0;
            }
        }

        System.out.println("After removal = " + Arrays.toString(arr4));
    }








}
