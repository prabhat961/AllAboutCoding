package DSA.binaryTree;

import static DSA.binaryTree.treeTraversssals.root;

public class diffFunctions {
    public static int findHIeght(Node root){
        if(root == null)
            return 0;
        return Math.max(findHIeght(root.right),findHIeght(root.left))+1;
    }
    public static int findSize(Node root){
        if (root == null)
            return 0;
        return findSize(root.left) + findSize(root.right) + 1;
    }

    public  static int findMax(Node root){
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }

    public  static int findMin(Node root){
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
    }

    public static void main(String[] args) {
        treeTraversssals bt = new treeTraversssals();
        root = new Node(7);
        root.left = new Node(8);
        root.right = new Node(9);
        root.left.left = new Node(10);
        root.left.right = new Node(11);
        System.out.println("hieght of the tree is: "+findHIeght(root));
        System.out.println(("Size of the tree is:"+findSize(root)));
        System.out.println("Maximum element in this tree ia:"+findMax(root));
        System.out.println(("Minimum Element in this tree is:"+findMin(root)));
    }
}
