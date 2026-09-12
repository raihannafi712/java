//LAB TASK NO NEED TO SUBMIT
public class Task5 {

        //===================================TASK#4===================================
        // This method takes 1 parameter, the root
        // This method returns the largest value
        // No Helper Methods are needed for this task
        public static Integer maxTree( BTNode root ){           /* IMPORTANT */
            if (root == null) {
                return 0;                                       /* It won't work if all nodes are negative nums  */
            }

            Integer left_node = maxTree(root.left);
            Integer right_node = maxTree(root.right);

            Integer max = (Integer) root.elem;

            if ((Integer) left_node > max) {                    /* We can't check root.elem > max. That would check root with root  */
                max = left_node;
            }
            if ((Integer) right_node > max) {
                max = right_node;
            }

            return max;
        }
        //============================================================================


}
