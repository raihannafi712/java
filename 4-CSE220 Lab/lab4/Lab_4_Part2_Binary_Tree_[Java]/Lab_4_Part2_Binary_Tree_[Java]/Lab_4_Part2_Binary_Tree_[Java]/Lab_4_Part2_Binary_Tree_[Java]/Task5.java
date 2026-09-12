//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum(BSTNode root){                              /* IMPORTANT */


        if (root == null) {
            return 0;
        }

        return mirrorHelper(root.left, root.right);


    }

    private static Integer mirrorHelper(BSTNode left , BSTNode right){

        if (left == null) {
            return 0;
        }

        if (right == null) {
            return 0;
        }

        Integer total = 0;                          
        total += (left.elem + right.elem);

        //Check the recursion tracing to know how it is checking each node and going back up to the parent

        total += mirrorHelper(left.left, right.right);       //In each call, total gets 0 and returns the total value of only those 2 nodes who are mirror                                               
        total += mirrorHelper(left.right, right.left);

        return total;

    }

















    //     if(root==null){

    //         return 0;
    //     }

    //     return mirror_s_helper(root.left,root.right);
    // }

    // private static Integer mirror_s_helper(BSTNode left, BSTNode right){

    //     if(left==null){

    //         return 0;
    //     }
    //     if(right==null){

    //         return 0;
    //     }

    //     int partial_x = left.elem+right.elem;
    //     partial_x+=mirror_s_helper(left.right,right.left);
    //     partial_x+=mirror_s_helper(left.left,right.right);

        
    //     return partial_x;

    //===============================================================


}
