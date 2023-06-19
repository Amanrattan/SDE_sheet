package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrderTraversal {
    private static List<Integer> reverseOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> ls = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            for(int i =0;i<levelsize;i++){
                Node curr = queue.poll();
                ls.add(curr.val);


                if(curr.right != null){
                    queue.add(curr.right);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }

            }
        }
        for(int i = ls.size() - 1; i >= 0; i--){
            reverse.add(ls.get(i));
        }
        return reverse;
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

        List<Integer> res = reverseOrderTraversal(root);
        System.out.println(res);
    }
}
