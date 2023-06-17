package BinaryTrees;

import java.util.Stack;

public class InOrderTraversal {
    private static void inOrderTraversal(Node root) {
        if(root == null){
            return;
        }
         inOrderTraversal(root.left);
        System.out.print(root.val + " ");
         inOrderTraversal(root.right);
    }

    //error
    private static void inOrderIteration(Node root) {
        if(root == null){
            return;
        }
        Node curr = root;
         Stack<Node> stack = new Stack<>();
         stack.push(curr);

         while( !stack.isEmpty()){

             curr = stack.pop();
             if(curr.right != null){
                 stack.push(curr.right);
             }

             System.out.print(curr.val + " ");

             if(curr.left != null){
                 stack.push(curr.left);
             }
        }
    }

    public static void main(String[] args){
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

        inOrderTraversal(root);
        System.out.println("");
        inOrderIteration(root);
    }




}
