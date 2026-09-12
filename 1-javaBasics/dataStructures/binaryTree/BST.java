public class BST {
    
    static class Node{
        int elem;
        Node left;
        Node right;

        public Node(int item){
            elem = item;
            left = right = null;
        }
    }

    Node root;




    
    //Insertion
     public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node current, int key) {
        if (current == null) {
            return new Node(key);
        }
        if (key < current.elem) {
            current.left = insertRec(current.left, key);
        } else if (key > current.elem) {
            current.right = insertRec(current.right, key);
        }
        return current;
    }







    // SEARCH
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.elem == key) {              //if root is that value
            return true;
        }

        if (key > root.elem ) {
            return searchRec(root.right, key);   

        } else {
            return searchRec(root.left, key);
        }

    }







    // FIND MINIMUM
    public int findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current.elem;

        //Or recursion
    }










    // FIND MAXIMUM
    public static Integer findMax(Node root) {

        if (root == null) {                             //If the BST is empty
            return null;
        }

        if (root.right == null) {                       //If the BST does not has a right subtree
            return (Integer) root.elem;
        }

        return findMax(root.right);

        //Or
        // while (current.right != null) {
        //     current = current.right;
        // }
        // return current.elem;

    }







    //  DELETION (3 Cases)       
    //Basically if its a  leaf node then it just vanishes and if it has children then in-order trav wise successor(right subtree's smallest one)    
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.elem ) {

            root.right = deleteRec(root.right, key);            
        } else if (key < root.elem) {

            root.left = deleteRec(root.left, key);

        }else{                                               //this else means we have found the value

            //Case 1 and 2
            // If both left and right are null then null will be returned and it will replace root.left when its upper node called 

            if (root.left == null) {

                return root.right;                          //If that node has only right child then that right child will be its successor
            }else if (root.right == null) {
                
                return root.left;                           //If that node has only left child then left right child will be its successor         
            }


            //Case 3
            //This part means the node has 2 children


            // Copy the in-order successor's value (smallest in right subtree)
            root.elem = findMin(root.right);                //It's right subtree's smallest value will replace it

            //Delete the in-order successor
            root.right = deleteRec(root.right,root.elem);   //It will traverse to that duplicate value and return null here
        }
        return root;

    }


    


    // Finding the predecessor (in-order) of a target node(value) (Inorder traversal not needed in BST, this method is more efficient)
    public static Integer inOrderPred(Node root, int value) {

        Node current = root;
        Node predecessor = null;
        Node target_node = null;                 //The node who's predecessor we are searching

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
            return findMax(target_node.left);              //We have to return the max of left subtree, not the predecessor because in some cases it might be null still

        }


        //Case 2  (If the target node doesn't have a left subtree then the predecessor is up somewhere)
        if (predecessor != null) {
            return predecessor.elem;            //We already kept saving the smallest elements than the target node.So the last one is the predecessor
        } else {
            return null;
        }
          
    }













    // BST does not need these traversals because it already sorts nodes in a specific order
    // 6. IN-ORDER TRAVERSAL (Left, Root, Right)
    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.elem + " ");
            inOrder(current.right);
        }
    }

    // 7. PRE-ORDER TRAVERSAL (Root, Left, Right)
    public void preOrder(Node current) {
        if (current != null) {
            System.out.print(current.elem + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    // 8. POST-ORDER TRAVERSAL (Left, Right, Root)
    public void postOrder(Node current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.elem + " ");
        }
    }




    // Main method testing all operations
    public static void main(String[] args) {
        BST bst = new BST();

        // Insert elements from the sample tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("In-Order Traversal: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.print("Pre-Order Traversal: ");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.print("Post-Order Traversal: ");
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 99: " + bst.search(99));

        System.out.println("Min Value: " + bst.findMin(bst.root));
        System.out.println("Max Value: " + bst.findMax(bst.root));

        System.out.println("\nDeleting 20 (leaf)...");
        bst.delete(20);
        System.out.print("In-Order: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.println("Deleting 30 (node with two children)...");
        bst.delete(30);
        System.out.print("In-Order: ");
        bst.inOrder(bst.root);
        System.out.println();
    }
}
