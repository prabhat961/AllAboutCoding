package GFGCodes.trees;
class Node{
    Node left;
    Node right;
    int data;
    Node(int x){
        this.data = x;
    }
}

public class implementation {
    public static void inOrderTraversal(Node root){
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+",");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root){
        if (root == null)
            return;
        System.out.print(root.data+",");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal (Node root){
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+",");
    }

    public static int printHieght(Node root){
        if (root == null)
            return 0;

        int leftHieght = printHieght(root.left);
        int rightHieght = printHieght(root.right);

        if (leftHieght < rightHieght)
            return rightHieght+1;
        else
            return  leftHieght + 1;
    }

    public static int printLeafCount(Node root){
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        else
            return printLeafCount(root.left)+printLeafCount(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(60);
        root.left.right.right = new Node(70);
        System.out.println("Pre Order traversal is:");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Post Order traversal is:");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("inOrder traversal is:");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Hieght of the given tree is:"+printHieght(root));
        System.out.println("Total Count of leaves in this tree is:"+printLeafCount(root));
    }

}
