// import java.util.Arrays;
// import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class basicTopics {
    public static void main(String[] args) {            /* Also called psvm in shortcut */

        // This space from the public keyword is called identation
        
        // 1. Data types  (Primitive and Non-primitive)

        // Java is case sensitive
        //  (//) helps create single line comments, (/* */) helps create comments within lines 
        // Name variables according to situation with descriptive names
        // System.out.println("haha " + "\n" + "no" );     /* \n to use line breaks in one S.O.P */

        // Primitive
        // int num1 = 1234;              /*num1 is Variable_name or identifier , 1234 is the value  */
        // byte num2 = 111;
        // float num3 = 64.6f;
        // short num4 = 9847;
        // double num5 = 55.67;
        // boolean num6 = true;
        // long num7 = 567;
        // char ch = 'k';                /* char variable has to be only one character and single quotation */

        // // Non-primitive
        // String haha = "jaja jaja";
        // int [] ar1 = {3,3,3,33}; 
        // Object haha = '8';



        // Variables

        // int x;         /* x variable has been declared but not initialized */
        // x = 5;         /* x variable has been initialized */


        // S.O.P line break
        // System.err.print("Start");
        // System.out.println("Middle"); /* The latter line will have a break */
        // System.out.print("End");



        // Datatype conversion  (Explicit and Implicit casting)

        // Explicit/Narrowing casting-  (Higher data types to lower)

        // double d = 5.998;
        // byte data = (byte)d;
        // System.out.println(data);

        // int s = 5;
        // byte g = (byte)s;
        // System.out.println(g);


        // Implicit/Widening casting-   (Lower to higher)

        // byte b = 10;
        // double dd = b;
        // System.out.println(dd);


        // Numeric to non numeric

        // // Int to String
        // int haha = 50;
        // String h2 = String.valueOf(haha);
        // System.out.println(h2);

        // // String to Integer
        // String h3 = "40";
        // int n = Integer.parseInt(h3);
        // System.out.println(n);

        // // Int to Char
        // int hehe = 44;
        // char c = (char)hehe;
        // System.out.println(c);      /* ASCII value is shown */

        // // Char to int
        // char cc = 'Z';
        // int gg = (int)cc;
        // System.out.println(gg);























        

        // 2. Operators

        // int eOne = 25;
        // int eTwo = 15;
        // double eThree = 10;
        
        // System.out.println(eOne + eThree);                 /* 1. Arithmetic operators */
        // System.out.println(eOne/=eTwo);                    /* 2. Assignment operators */
        // System.out.println(eOne>eTwo);                     /* 3. Relational operators */
        // System.out.println(eOne>eTwo && eOne!=eTwo);       /* 4. Logical operators */

        //                             /* 5. Bitwise operator start */
        // System.out.println(eResult);                      /* AND operator */
        // System.out.println(eResult2);                     /* OR operator */
        // System.out.println( (10==10) ^ (5==5));           /* XOR operator */
        // System.out.println(~4);                           /* bitwise complement*/
        //                            /* Bitwise operator end */

        //                            /* 6. Unary operators start*/

        // ##Pre increment and decrement
            // int a = 5;
            // int b = ++a;              /* When a is assigned to b,only then it becomes (a+1) */  /* pre-increment */
            // int c = --a;              /* When a is assigned to b,only then it becomes (a-1) */  /* pre-decrement */
            // System.out.println(a);
            // System.out.println(b);    /* pre-increment */
            // System.out.println(c);    /* pre-decrement */

        // ##Post increment and decrement

            /* Clear the topic in the first example */

        // int ami = 5;

        // System.out.println(ami++);  /* ami = 5 */
        // System.out.println(ami++);  /* ami = 6 */
        // System.out.println(ami++);  /* ami = 7 */
        // System.out.println(ami);    /* ami = 8 */

        // ami--;                      /* Next output will have ami = 7 */
        // System.out.println(ami);    /* ami = 7 */

        // int d = 10;
        // System.out.println(d);
        // int e = d++;
        // System.out.println(e);
        // System.out.println(d);
        // int f = d--;
        // System.out.println(f);
        // System.out.println(d);



        //                                       /* Unary operators end*/

        //                                   /* Binary basics in programming */

        //   /* IN BINARY, TRUE = 1 , FALSE = 0 */

        /* 1.  AND operator truth table*/      /* One false will make the system false */
        // 0 0 = 0
        // 0 1 = 0
        // 1 0 = 0
        // 1 1 = 1

        /*2.  OR operator truth table*/        /*One true will make it true because its this OR that */
        // 0 0 = 0
        // 0 1 = 1
        // 1 0 = 1
        // 1 1 = 1

        /*3.  NOT operator truth table*/        
        // 0 = 1
        // 1 = 0


        /*4.  XOR operator truth table*/        
        // 0 0 = 0
        // 0 1 = 1
        // 1 0 = 1
        // 1 1 = 0


        // 5.  Bitwise complement
        //  ~x = -(x+1)

        // int eResult = (eOne & eTwo);
        //  Bit wise AND operator      
        //   25 = 1 1 0 0 1 
        //   15 = 0 1 1 1 1
        //    9 = 0 1 0 0 1             /* No addition or substraction here.if there's one false like 0 and 1 then it is 0 in the results */
       
        // int eResult2 = (eOne | eTwo);
        //  Bit wise OR operator      
        //   25 = 1 1 0 0 1 
        //   15 = 0 1 1 1 1
        //   31 = 1 1 1 1 1             /* No addition or substraction here.if there's one false like 0 and 1 then it is 0 in the results */





        // Operator precedence

        // If all the operators are from the same precedence,then left to right solve while maintaining BODMAS




















     
        // 3. Control flow 

        //                                           /*  1.Branching */

        // #If-else

        //                                      /*  Leap year example */

        // Scanner year = new Scanner(System.in);
        // System.out.println("Enter the year= ");
        // int input_year = year.nextInt();

        // if (input_year%4 == 0 && input_year%100 != 0 || input_year%400 == 0) {
        //     System.out.println("It is a leap year");
        // } else {
        //     System.out.println("It is not a leap year");
        // }

        // year.close();







        //                                           /*  2.Loops */

        //                                     /* While loop */

        // int a = 0;                                   /* initialization*/
        // while (a<10) {                               /* condition */         // When a == 10 , the loop will end. basically while loop runs as long as the condition is true

        //     System.out.println("we'll make it");     /* body */
        //     a +=1;                                   /* Steps */

        // }




        //                               /* For loop */

        // for (int i = 0; i <=1 ; i+=1) {                         /* initialization */  /* condition */  /* Steps */
                
        //     if (i%2==0) {
        //             System.out.println(i +" = even numbers");
        //         }else{
        //             System.out.println(i +" = odd numbers");
        //         }                                                        /* body */

        //     }




        //                                      /* 3. Nested loops */

        //                        /* Same nested loop in while and for loop */     /* For tracing,check notes */

            // int outer = 1;
            // while (outer <= 2) {
            //     int inner = 1;

            //     while (inner <=3) {
            //         System.out.println(outer + " " + inner);
            //         inner += 1;
            //     }
            //     System.out.println("Inner loop ends");
            //     outer += 1;
            // }

            // for (int outer = 1; outer <= 2; outer++ ) {
            //     for (int inner = 1; inner <=3; inner++) {
            //         System.out.println(outer + " " + inner);
            //     }
            //     System.out.println("Inner loop ends");
            // }



            //                                  /* 4. Control flow keywords */

            // #break statement

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the ID you want to find: ");
            // int find = sc.nextInt();

            // for (int i = 1; i <= 100; i++) {
                
            //     if (i == find ) {
            //         System.out.println(find + "found");
            //         break;
            //     }
            //     System.out.println(i);
            // }
            // sc.close();



            //  # Continue statement

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the ID you do not want to give chocolate: ");
            // int noChocolate = sc.nextInt();

            // for (int i = 1; i <= 10; i++) {
                
            //     if (i == noChocolate) {
            //         continue;
            //     }
            //     System.out.println(i + " given");
            // }
            // sc.close();






















            // 4. Arrays

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
            // int [][] arr5 = {
            // {1,2,3} , 
            // {4,5,6} , 
            // {7,8,9}
            // };                               /* This is the matrix */


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







            // TO PRINT 

            // 1. THE WHOLE ARRAY

            // 1D arrays-
            // System.out.println("1D array -" + Arrays.toString(arr1));


            // 2D arrays
            // System.out.println("2D matrix - " + Arrays.deepToString(arr5));
            

            // 3D arrays
            // System.out.println("3D matrix - " + Arrays.deepToString(arr7));

            // Or Use loops







            //  2. INDIVIDUAL ELEMENTS AND ROWS

            // 1D arrays-
            // System.out.println("1D array element -" + arr1[0] );


            // 2D arrays
            // System.out.println("2D matrix's 1st row 2nd element - " + arr5[0][1]);
            // System.out.println(arr5[0]);                                             /* whole row memory location and it is a linear array */
            
            
            // 3D arrays
            // System.out.println("3D matrix - " + arr7[0][1][0]);





            

            // 3. Matrix from 2D arrays-

            // int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};      /* This array will show a 3x3 (row x col) matrix */
        
            // System.out.println("Original matrix / Row wise-");
            // for (int i = 0; i < arr1.length; i++) {         /* Row */

            //     for (int j = 0; j < arr1[0].length; j++) {  /* Column */
            //         System.out.print(arr1[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            // System.out.println("Transpose matrix / Column wise-");
            // for (int i = 0; i < arr1[0].length; i++) {

            //     for (int j = 0; j < arr1.length; j++) {
            //         System.out.print(arr1[j][i] + " ");
            //     }
            //     System.out.println();
            // }









            //                       /* TO CHECK LENGTH */

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






            // // Sorting in descending order - selection sort

            // for (int i = 0; i < arr.length - 1; i++) {
                
            //     for (int j = 0; j < arr.length - i - 1; j++) {
                    
            //         if (arr[j] < arr[j+1]) {
            //             int temp = arr[j];
            //             arr[j] = arr[j+1];
            //             arr[j+1] = temp;
            //         }
            //     }
            // }





            // // Sorting in ascending order - bubble sort
            
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

            




            
        
            //                                 /* Array tracing */

            // int [] arr9 = new int [10];
            // int [] b;

            // int index1 = 0 , index2 = 0;

            // index1 =1;
            // b = arr9;
            // while (index1 < 6) {
                
            // }


















            // 5. Strings

            //CREATING STRINGS

            // String s1 = "First created string";                              /*Using string literal  */

            // String s2 = new String("Hello");                                 /* New keyword */

            // char[] ch = {'H', 'e', 'l', 'l', 'o'};                           /* Char array */
            // String s3 = new String(ch);
            // System.out.println(s3);

            // StringBuilder sb = new StringBuilder();                          /* StringBuilder */
            // sb.append("Hello");
            // sb.append(" World");
            // String s5 = sb.toString();




            //DISPLAY

            // System.out.println(s1);




            //DISPLAY STRING LENGTH AND CHARACTERS                                 

            // System.out.println(s2);
            // System.out.println("s2's length= " + s2.length());                                       /* To print string's length */ /* Length is always one more than the index number  */
            // System.out.println("index 3's character= " + s2.charAt(3));                              /* To print a string's specific index's character */
            // System.out.println("last character of the string = " + s2.charAt(s2.length()-1));        /* To print the last index */



            //MODYFYING STRINGS 
            // Once a String is created, you cannot directly add or modify characters/elements inside it. So java creates new objects to add
            // If we use String builder, then elements can be added
            // String s = "hello";         //hello
            // s = s + "world";            //hello world (It creates new string object)






            //                                     /* To take string and characters inputs */

            // Scanner sc = new Scanner(System.in);     
            // String s2 = sc.nextLine();                 /* To take the whole input */

            // Scanner sc = new Scanner(System.in);
            // String s3 = sc.next();                     /* To take only the input before any whitespace  */
            // System.out.println(s3);

            // Scanner sc = new Scanner(System.in);
            // char c1 = sc.next().charAt(0);             /* A character's index is always 0 */


            //                                     /* ASCII values*/



            //                                     /* Comparing Strings */

            // String s4 = "haha";
            // String s5 = "haha";

            // System.out.println(s4.equals(s5));              /* Case sensitive */
            // System.out.println(s4.equalsIgnoreCase(s5));    /* Case insensitive */

            //                                    /* Split strings */

            // String s6 = "this is nowhere";
            // String [] s6_arr = s6.split(" ");
            // System.out.println(Arrays.toString(s6_arr));

            //                                    /* Substring check (only strings can be checked)  */

            // String s7 = "This is nothing";  
            // char c1 = 'h';           
            // boolean checkOne = s7.contains("is");
            // boolean checkTwo = s7.contains("what");
            // boolean checkThree = s7.contains(String.valueOf(c1));   /* checking while converting char into String */

            // System.out.println(checkOne + " " + checkTwo + " " + checkThree);

            //                                     /* Lower case and upper case conversion of STRINGS AND CHARACTER */

            // String s8 = "HAHA IM SO DEAD";
            // char c2 = 'H';
            // char c2LowerCase = Character.toLowerCase(c2);     /* new char needs to be assigned to convert */

            // System.out.println(s8.toLowerCase());
            // System.out.println(c2LowerCase);

























            // 6. Method    /* CHECK METHOD FILE (methods.java) */
















            // 7. 































































        }









        

        
        
        
        
        
        
        
        
        
        
        
        

        
   
        
        
    }




        
        
   

