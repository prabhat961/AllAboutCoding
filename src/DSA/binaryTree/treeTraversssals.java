package DSA.binaryTree;

import static DSA.binaryTree.implementation.createTree;


    public class treeTraversssals {

        static Node root;

        treeTraversssals() {
            root = null; }
        public static void inOrder(Node root) {
            if (root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void preOrder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args) {
            treeTraversssals bt = new treeTraversssals();
            bt.root = new Node(7);
            bt.root.left = new Node(8);
            bt.root.right = new Node(9);
            System.out.println("InOrder Traversal of the tree is:");
            inOrder(root);
            System.out.println();
            System.out.println("preOrder Traversal of the tree is:");
            preOrder(root);
            System.out.println();
            System.out.println("postOrder Traversal of the tree is:");
            postOrder(root);
        }
    }

