package DSA.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
    public static void linebyline(Node root){
        if (root == null)
            return;
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
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
        System.out.println("Level Order Traversal of the tree is:");
        System.out.println();
        linebyline(root);
    }
}
