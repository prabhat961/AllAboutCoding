package DSA.binarytrees;

public class leftView {

    static int maxLevel=0;
    public static void printLeft(Node root,int level){
        if(root==null)
            return;
        if(maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel=level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }

    public static void printLeftView(Node root){
        printLeft(root,1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        printLeftView(root);
    }
}
