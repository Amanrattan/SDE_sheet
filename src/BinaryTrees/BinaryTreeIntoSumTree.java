package BinaryTrees;

import java.util.List;

public class BinaryTreeIntoSumTree  {

    private static int sum(Node root) {
        if(root == null){
            return 0;
        }

        int oldValue = root.val;
        root.val = sum(root.left) + sum(root.right);
        return oldValue + root.val;
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


        int l = sum(root);
        System.out.print(l);

    }


}
