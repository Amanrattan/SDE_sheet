package BinaryTrees;

import static java.lang.Math.max;

public class BalancedTres {

    private static boolean balancedTree(Node root) {
        if(root == null || root.left == null && root.right == null){
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        if(Math.abs(lh - rh) > 1){
            return false;
        }
        return balancedTree(root.left) && balancedTree(root.right);
    }

    private static int height(Node root) {

        if(root.left == null && root.right == null){
            return 1;
        }

        return 1+ max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        Node p5 = new Node(6);
        Node p6 = new Node(7);

        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p4.left = p5;
        p4.right = p6;

        boolean res = balancedTree(root);
        System.out.println(res);
    }
}
