package DSA.binaryTree;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        this.data = x;

    }
}

public class implementation {
    static Scanner sc = null;
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);

        System.out.println("Enter left node data:"+data);
        root.left = createTree();

        System.out.println("Enter right node data:"+data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();

    }
}
