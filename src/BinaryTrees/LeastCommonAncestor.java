package BinaryTrees;

import java.util.List;

public class LeastCommonAncestor {
    private static Node lca(Node root,Node n1,Node n2) {
         if(root == null){
             return null;
         }
         if(root == n1 || root == n2){
             return root;
         }

         Node left = lca(root.left, n1 ,n2);
         Node right = lca(root.right, n1 ,n2);

         if(left == null){
             return right;
         }
         if(right == null){
             return left;
         }
         return root;
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


        Node l = lca(root,p1,p2);
        System.out.print(l.val);

    }


}
