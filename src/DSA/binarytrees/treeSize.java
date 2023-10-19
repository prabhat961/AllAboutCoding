package DSA.binarytrees;

public class treeSize {
    public static int getSize(Node root){
        if (root == null)
            return 0;
        else
            return 1 + getSize(root.right) + getSize(root.left);
    }

    public static int getMax(Node root){
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key,Math.max(getMax(root.right),getMax(root.left)));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println( "Size of the tree is:"+getSize(root));
        System.out.println( "maximum value in the tree is:"+getMax(root));
    }
}
