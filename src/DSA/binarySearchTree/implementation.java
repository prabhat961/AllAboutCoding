package DSA.binarySearchTree;
class Node{
    Node left;
    Node right;
    int data;

    Node(int d){
        data = d;
        left = right = null;
    }
    boolean searchBST( Node root, int x){
        if (root == null)
            return false;

        if (root.data == x)
            return true;

        if (root.data > x) {
            return searchBST(root.left, x);
        }
        return searchBST(root.right, x);
    }

    Node insertBST(Node root, int key){
        if (root == null){
            return new Node(key);
        }
        if (root.data > key) {
            root.left = insertBST(root.left, key);
        } else if (root.data < key) {
            root.right = insertBST(root.right, key);
        }
        return root;
    }

    public static Node deleteNode(Node root, int key){
        if (root == null)
            return root;

        if (key < root.data)
         root.left = deleteNode(root.left, key);

        else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }

        else {
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return  root.left;

            root.data = minValue(root.right);

            root.right = deleteNode(root.right, root.data);
        }
        return  root;

    }

    public static int minValue(Node root){
        int minV = root.data;

        while (root.left != null){
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }
//Check for BST
    public static boolean isBSTUtil(Node node, int min, int max){
        if (node == null)
            return true;

        if (node.data < min || node.data > max)
            return false;

        return (isBSTUtil(node.left,min, node.data -1) &&
                isBSTUtil(node.right, max, node.data +1));
    }

    public static boolean isBST(Node root){
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
public class implementation {
    public static void main(String[] args) {

    }
}
