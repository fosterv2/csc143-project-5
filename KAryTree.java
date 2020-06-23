
/**
 * The class KAryTree keeps track of a binary search tree of KTreeNodes and IntNodes. It has methods to add new data to a node and add
 * the node to the correct place in the tree, left, right, or same. It also has methods to return an array of integers of positions with the data in order.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class KAryTree<E extends Comparable<E>> {

    // instance variables
    private KTreeNode<E> root;
    private int count;
    private int[] orderArr;
    private int arrCount;

    /**
     * Constructor for objects of class BinaryTree
     */
    public KAryTree() {
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
    private KTreeNode add(E newData, int newPos, KTreeNode<E> startNode) {
        KTreeNode<E> newNode = new KTreeNode(newData, newPos);
        if (startNode == null) {
            startNode = newNode;
        } else if (newNode.compareTo(startNode) == 0) {
            if (startNode.same == null) {
                startNode.same = new IntNode(newPos);
            } else {
                startNode.same = addSame(newPos, startNode.same);
            }
        } else if (newNode.compareTo(startNode) < 0) {
            startNode.left = add(newData, newPos, startNode.left);
        } else {
            startNode.right = add(newData, newPos, startNode.right);
        }
        return startNode;
    }

    /**
     * This private method uses recursion to add an IntNode to the end of a line of same references
     *
     * @param   newPos      the position associated with the new node
     * @param   startNode   The IntNode at which to start searching for the end of the line a same references
     * @return              the startNode after it has been changed
     */
    private IntNode addSame(int newPos, IntNode startNode) {
        if (startNode == null) {
            startNode = new IntNode(newPos);
        } else {
            startNode.same = addSame(newPos, startNode.same);
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
    private int[] getPosData(KTreeNode<E> startNode) {
        if (startNode != null) {
            getPosData(startNode.left);
            orderArr[arrCount] = startNode.pos;
            arrCount++;
            if (startNode.same != null) {
                IntNode current = startNode.same;
                while (current != null) {
                    orderArr[arrCount] = current.pos;
                    current = current.same;
                    arrCount++;
                }
            }
            getPosData(startNode.right);
        }
        return orderArr;
    }

    private class KTreeNode<E extends Comparable<E>> implements Comparable<KTreeNode<E>> {

        public E data;
        public int pos;
        public KTreeNode<E> left;
        public KTreeNode<E> right;
        public IntNode same;

        /**
         * Constructor for objects of class KTreeNode
         */
        public KTreeNode(E value, int position) {
            data = value;
            pos = position;
            left = null;
            right = null;
            same = null;
        }

        /**
         * This method compares two KTreeNodes and returns zero if the nodes are equals, a negative number if the second is less than
         * the first, and a positive number if the second is greater than the first
         *
         * @param   other   another KTreeNode to compare this one to
         * @return          an integer
         */
        public int compareTo(KTreeNode<E> other) {
            return this.data.compareTo(other.data);
        }
        
    }
    
    private class IntNode {
        
        public int pos;
        public IntNode same;
        
        /**
         * Constructor for objects of class IntNode
         */
        public IntNode(int position) {
            pos = position;
            same = null;
        }
        
    }
    
}
