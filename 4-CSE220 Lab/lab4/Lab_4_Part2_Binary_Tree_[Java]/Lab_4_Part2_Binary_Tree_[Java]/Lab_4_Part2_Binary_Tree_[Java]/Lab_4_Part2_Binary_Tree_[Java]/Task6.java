//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST(BSTNode root){                                                  /* IMPORTANT */

        return BSTHelper(root, null, null);

    }


    private static Boolean BSTHelper(BSTNode root , Integer min , Integer max){

        if (root == null) {
            return true;
        }

        if ((min != null && root.elem <= min) ||(max != null && root.elem >= max ) ) {          //root <= min and root >= max automatically makes it false
            return  false;
        }
        //So far this node is ok and move to next subtree

        //If either one of the returns is false that means one subtree has not followed the BST rule. So false

        return BSTHelper(root.left, min, root.elem)                 //Go to LEFT child and the max of that subtree will be that root
        && BSTHelper(root.right, root.elem, max);                   //Go to RIGHT child and the min of that subtree will be that root

    }
    //===============================================================


}
