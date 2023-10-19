package DSA.binarytrees;

class Node{

    int key;
    Node left;
    Node right;

    Node(int k){
        key = k;
    }
}
public class implementation {

    public static void inorderTraversal(Node root){
        if (root != null){
            inorderTraversal(root.left);
            System.out.print(root.key +" ");
            inorderTraversal(root.right);

        }
    }

    public static void prerderTraversal(Node root){
        if (root != null){
            System.out.print(root.key +" ");
            prerderTraversal(root.left);
            prerderTraversal(root.right);

        }
    }

    public static void PostorderTraversal(Node root){
        if (root != null){
            PostorderTraversal(root.left);
            PostorderTraversal(root.right);
            System.out.print(root.key +" ");

        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
        System.out.println();
        System.out.println("PreOrder Traversal:");
        prerderTraversal(root);
        System.out.println();
        System.out.println("PostOrder Traversal:");
        PostorderTraversal(root);
    }
}
