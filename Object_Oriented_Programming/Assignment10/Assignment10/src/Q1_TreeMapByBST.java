/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (50 marks in total)
    Use mutils.BinarySearchTree as a basic structure to implement a TreeMap for <String, Integer>.
    You cannot use JCF provided map.
 */

import mutils.BinarySearchTree;
import mutils.Node;

import java.util.ArrayList;

public class Q1_TreeMapByBST {

    // use m_bst as the basic data structure for the treemap of <String, Integer>
    BinarySearchTree m_bst = new BinarySearchTree();

    // Question 1.1 (5 marks): implement method size().
    // Returns the number of elements in this map (its cardinality).
    // You can ONLY modify the body of this method including the return statement.

    // helper function
    int count = 0;
    public void counter(Node root_node){
        if (root_node == null){
            return;
        }
        counter(root_node.left);
        count++;
        counter(root_node.right);
    }
    public int size(){
        counter(m_bst.root);
        return count;
    }

    // Question 1.2 (5 marks): implement method isEmpty().
    // Returns true if this map contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        }
        return false;
    }

    // Question 1.3 (15 marks) implement method get().
    // If key is contained in the map, return the value of the key.
    // If key is not contained in the map, return -1.
    // You can ONLY modify the body of this method including the return statement.
    public int get(String key) {
        return getVal(m_bst.root,key);
    }
    private int getVal(Node root, String key){
        if (root == null){
            return -1;
        }
        int compare = key.compareTo(root.data);
        if (compare < 0){
            return getVal(root.left,key);
        }else if (compare > 0){
            return getVal(root.right,key);
        }else{
            return root.freq;
        }
    }

    // Question 1.4 (15 marks) implement method put().
    // If the key is already contained in the map, overwrite the old value and return -1;
    // If the key is not contained in the map, add a new <key,value> entry to the map and return 1;
    // You can ONLY modify the body of this method including the return statement.
    public int put(String key, int value) {
        return insertVal(key, value, m_bst.root);
    }
    private int insertVal(String key, int value,Node root){
        if (root == null){
            m_bst.root = new Node(key,value);
            return 1;
        }
        int compare = key.compareTo(root.data);
        if (compare < 0){
            if (root.left == null) {
                root.left = new Node(key, value);
                return 1;
            } else {
                return insertVal(key,value,root.left);
            }
        }else if (compare > 0){
            if (root.right == null){
                root.right = new Node(key,value);
                return 1;
            }else{
                return insertVal(key, value,root.right);
            }
        }else{
            root.freq = value;
            return -1;
        }
    }
    // Question 1.5 (10 marks) implement method getKeysInAlphabeticalOrder().
    // return the keys of this map as an ArrayList<String> in Alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    ArrayList<String> alphabet = new ArrayList<>();
    public ArrayList<String> getKeysInAlphabeticalOrder(){
        alphabet.clear();
        alphalist(m_bst.root);
        return alphabet;
    }

    private void alphalist(Node root){
        if (root == null){
            return;
        }
        alphalist(root.left);
        alphabet.add(root.data);
        alphalist(root.right);
    }

}
