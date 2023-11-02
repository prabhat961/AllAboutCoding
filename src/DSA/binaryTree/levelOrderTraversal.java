package DSA.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
    //naive approach
    public static void printLevelOrderNaive(Node root, int level){
        if (root == null)
            return;
        if(level == 1){
            System.out.print(root.data +" ");
    } else if (level > 1) {
            printLevelOrderNaive(root.left, level - 1);
            printLevelOrderNaive(root.right, level - 1);
        }

        }

    public static void printLevelOrder(Node root){
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if (curr.left != null){
                q.add(curr.left);
            }
            if (curr.right != null){
                q.add(curr.right);
            }
        }
    }
        public static void main(String[] args) {

    }
}
