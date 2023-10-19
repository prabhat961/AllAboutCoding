package DSA.binarytrees;

public class balancedBinaryTree {

    public static boolean isBalanced(Node root){
        if(root==null)
            return true;
        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static int height(Node root){
        if(root==null)
            return 0;
        else
            return (1+Math.max(height(root.left),height(root.right)));
    }
    //Efficient Solution

    public static int isBalancedefficient(Node root){
        if(root==null)
            return 0;
        int lh=isBalancedefficient(root.left);
        if(lh==-1)return -1;
        int rh=isBalancedefficient(root.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;
    }
}
