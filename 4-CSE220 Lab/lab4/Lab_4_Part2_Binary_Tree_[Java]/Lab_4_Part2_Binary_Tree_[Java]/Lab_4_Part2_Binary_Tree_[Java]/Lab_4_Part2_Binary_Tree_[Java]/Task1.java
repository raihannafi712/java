//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method

public class Task1 {

    //======================TASK#1a======================
    // This method takes only 1 parameter; root of a BST
    // You'll need to find the max of the BST and return it
    public static Integer maxOfBST(BSTNode root) {

        if (root == null) {
            return 0;
        }

        if (root.right == null) {
            return root.elem;
        }

        return maxOfBST(root.right);


    // //OR

    // //     Node maxOfBST(Node node) {
    // //     while (node.right != null) {
    // //         node = node.right;
    // //     }
    // //     return node;
    }
    //==================================================

    //======================TASK#1b======================
    // This method takes only 2 parameters
    // root of a BST and the value of which you wanna the predecessor
    // You'll need to find the max of the BST and return it
    public static Integer inOrderPred(BSTNode root, int value) {    //2 Cases

        BSTNode current = root;
        BSTNode predecessor = null;
        BSTNode target_node = null;                 //The node who's predecessor we are searching

        //Searching the target node
        while (current != null) {
            
            if (current.elem == value) {            //Found the target node
                target_node = current;
                break;

            } else if (current.elem > value) {      //If the current node is greater than the value, then target node is in the left subtree
                current = current.left;

            }else{  //current.elem < value          //This means current node could be the predecessor so just add it as pred for now                                  
                predecessor = current;
                current = current.right;
            }
        }
        // Found the target node. Now, we find the predecessor

        // If the target node does not exist in the tree
        if (target_node == null) {
            return null;
        }

        // Case 1 (predecessor is max of left subtree)
        if (target_node.left != null) {
            return maxOfBST(target_node.left);              //We have to return the max of left subtree, not the predecessor because in some cases it might be null still
        }


        //Case 2  (If the target node doesn't have a left subtree then the predecessor is up somewhere)
        if (predecessor != null) {
            return predecessor.elem;            //We already kept saving the smallest elements than the target node.So the last one is the predecessor
        } else {
            return null;
        }
          
    }




    //==================================================
}
