//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task2 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        BSTNode current = root;                                     

        while (current != null) {
            
            if (x < current.elem && y < current.elem) {             //If both values are smaller
                current = current.left;

            } else if (x > current.elem && y > current.elem) {      //If both values are bigger 
                current = current.right;

            }else {                                                 //If both values are = current / x = curr and y < curr / x = curr and y > curr / vice versa
                
                return current.elem;                                //All the above cases mean the current node is the LCA
            }
        }
        return null;                                                // x or y not found / empty tree
    }
    //==================================================

}
