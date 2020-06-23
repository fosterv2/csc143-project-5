
/**
 * The class BinaryTree keeps track of a binary search tree of nodes. It has methods to add new data to a node and add the node to the
 * correct place in the tree, left or right. It also has methods to return an array of integers of positions with the data in order.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class BinaryTree<E extends Comparable<E>> {

    // instance variables
    private TreeNode<E> root;
    private int count;
    private int[] orderArr;
    private int arrCount;

    /**
     * Constructor for objects of class BinaryTree
     */
    public BinaryTree() {
        root = null;
        count = 0;
    }

    /**
     * This method returns the number of elements in the tree
     *
     * @return    the count of the BinaryTree
     */
    public int getSize() {
        return this.count;
    }
    
    /**
     * This method adds a new node to the tree with data and a position by sending all the information to the recursive funtion
     *
     * @param   newData     the data to add to the tree
     * @param   newPos      the position associated with the data
     */
    public void add(E newData, int newPos) {
        root = add(newData, newPos, root);
        count++;
    }

    /**
     * This private method adds a new node to the binary tree by using recursion to search for the right place to add it,
     * starting the search at the specified node in the tree.  
     * 
     * @param   newData         the data to add to the tree
     * @param   newPos          the position associated with the data
     * @param   startNode       the TreeNode at which to start searching for the proper place for the data
     * @return                  the startNode after it has been changed
     */
    private TreeNode add(E newData, int newPos, TreeNode<E> startNode) {
        TreeNode<E> newNode = new TreeNode(newData, newPos);
        if (startNode == null) {
            startNode = newNode;
        } else if (newNode.compareTo(startNode) < 0) {
            startNode.left = add(newData, newPos, startNode.left);
        } else {
            startNode.right = add(newData, newPos, startNode.right);
        }
        return startNode;
    }

    /**
     * This method initializes the array to return and the counter and calls the recursive function to do the work
     *
     * @return    an array of positions of the nodes in the tree in order
     */
    public int[] getPosData() {
        orderArr = new int[count];
        arrCount = 0;
        getPosData(root);
        return orderArr;
    }
    
    /**
     * This private method uses a staring node to search through the tree and add the positions of the nodes in order
     *
     * @param   startNode   the TreeNode to start searching through and add to the array
     * @return              an array of positions of the nodes
     */
    private int[] getPosData(TreeNode<E> startNode) {
        if (startNode != null) {
            getPosData(startNode.left);
            orderArr[arrCount] = startNode.pos;
            arrCount++;
            getPosData(startNode.right);
        }
        return orderArr;
    }
    
    private class TreeNode<E extends Comparable<E>> implements Comparable<TreeNode<E>> {

        public E data;
        public int pos;
        public TreeNode<E> left;
        public TreeNode<E> right;

        /**
         * Constructor for objects of class TreeNode
         */
        public TreeNode(E value, int position) {
            data = value;
            pos = position;
            left = null;
            right = null;
        }

        /**
         * This method compares two KTreeNodes and returns zero if the nodes are equals, a negative number if the second is less than
         * the first, and a positive number if the second is greater than the first
         *
         * @param   other   another KTreeNode to compare this one to
         * @return          an integer
         */
        public int compareTo(TreeNode<E> other) {
            return this.data.compareTo(other.data);
        }
        
    }

}
