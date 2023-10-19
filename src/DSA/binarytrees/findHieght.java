package DSA.binarytrees;

public class findHieght {

    public static int printHieght(Node root){
        if (root == null)
            return 0;
        else
            return Math.max(printHieght(root.left), printHieght(root.right)) + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println("Hieght of the tree is:"+printHieght(root));
    }
}
